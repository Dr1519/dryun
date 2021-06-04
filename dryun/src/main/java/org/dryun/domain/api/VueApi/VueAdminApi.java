package org.dryun.domain.api.VueApi;

import org.dryun.common.OperLog;
import org.dryun.domain.entity.AdminUser;
import org.dryun.domain.service.AdminUserService;
import org.dryun.jwt.JwtUtil;
import org.dryun.redis.RedisUtil;
import org.dryun.untils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("api/admin")
@CrossOrigin
public class VueAdminApi {
    @Autowired
    private AdminUserService adminUserService;
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value = "/adminLogin",method = RequestMethod.POST)
    @ResponseBody
    @OperLog(operModul = "Admin", operType = "查询", operDesc = "用户登录")
    public Result adminLogin(String adminUserNumber,String adminUserPass){
        AdminUser adminUser = adminUserService.adminLogin(adminUserNumber, adminUserPass);
        String adminUserId = adminUser.getAdminUserId();
        if (adminUser!=null){
            String token = JwtUtil.sign(adminUser.getAdminUserNumber(), adminUser.getAdminUserPass());
            return new Result().build(200,"登陆成功",token);
        }else {
            return new Result().build(403,"登陆失败");
        }
    }

    @RequestMapping(value = "/getAdminUserList",method = RequestMethod.GET)
    @ResponseBody
    @OperLog(operModul = "Admin", operType = "查询", operDesc = "获取全部用户列表")
    public Result getAdminUserList(){
        List<AdminUser> adminUserList = adminUserService.allAdminUser();
        if (adminUserList!=null){
            return new Result().build(200,"用户数据获取成功",adminUserList);
        }else {
            return new Result().build(201,"用户数据获取失败");
        }
    }
}
