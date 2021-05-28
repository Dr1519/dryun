package org.dryun.domain.api.WechatApi;

import org.dryun.domain.entity.Goods;
import org.dryun.domain.service.GoodsService;
import org.dryun.untils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("wx/goods")
public class GoodsApi {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/getGoodsList",method = RequestMethod.GET)
    @ResponseBody
    public Result getGoodsList(){
        List<Goods> goodsList = goodsService.finAllGoods();
        if (goodsList!=null){
            return new Result().build(200,"数据获取成功",goodsList);
        }else {
            return new Result().build(201,"数据获取失败");
        }
    }

    @RequestMapping(value = "/getGoodsListByType",method = RequestMethod.POST)
    @ResponseBody
    public Result getGoodsListByType(@RequestParam String goodsTypeId){
        List<Goods> goodsList = goodsService.finGoodsByType(goodsTypeId);
        if (goodsList!=null){
            return new Result().build(200,"数据获取成功",goodsList);
        }else {
            return new Result().build(201,"数据获取失败");
        }
    }
}
