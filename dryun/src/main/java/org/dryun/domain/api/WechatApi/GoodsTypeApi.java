package org.dryun.domain.api.WechatApi;

import org.dryun.domain.entity.ClassIfy;
import org.dryun.domain.entity.GoodsType;
import org.dryun.domain.service.ClassIfyService;
import org.dryun.domain.service.GoodsTypeService;
import org.dryun.untils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("wx/goodsType")
public class GoodsTypeApi {

    @Autowired
    private GoodsTypeService goodsTypeService;
    @Autowired
    private ClassIfyService classIfyService;

    @RequestMapping(value = "/getClassIfy",method = RequestMethod.GET)
    @ResponseBody
    public Result getClassIfy(){
        List<ClassIfy> classIfyList = classIfyService.finAllClassIfy();
        if (classIfyList!=null){
            return new Result().build(200,"数据获取成功",classIfyList);
        }else {
            return new Result().build(201,"数据获取失败");
        }
    }

    @RequestMapping(value = "/getGoodsType",method = RequestMethod.POST)
    @ResponseBody
    public Result getGoodsType(@RequestParam String classIfyId){
        List<GoodsType> goodsTypeList = goodsTypeService.finGoodsTypeByClassIfyId(classIfyId);
        if (goodsTypeList!=null){
            return new Result().build(200,"数据获取成功",goodsTypeList);
        }else {
            return new Result().build(201,"数据获取失败");
        }
    }
}
