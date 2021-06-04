package org.dryun.domain.api.VueApi;

import org.dryun.domain.entity.ClassIfy;
import org.dryun.domain.entity.Goods;
import org.dryun.domain.entity.GoodsPack;
import org.dryun.domain.entity.GoodsType;
import org.dryun.domain.service.ClassIfyService;
import org.dryun.domain.service.GoodsService;
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
@RequestMapping("api/goods")
public class VueGoodsApi {

    @Autowired
    private GoodsService goodsService;
    @Autowired
    private GoodsTypeService goodsTypeService;
    @Autowired
    private ClassIfyService classIfyService;

    @RequestMapping(value = "/getGoodsList",method = RequestMethod.POST)
    @ResponseBody
    public Result getGoodsList(GoodsPack goodsPack){
        List<List<?>> lists = goodsService.queryGoodsPage(goodsPack);
        List<Goods> goodsList = (List<Goods>) lists.get(0);
        Integer count = (Integer) lists.get(1).get(0);
        System.err.println("list:"+goodsList+"  count:"+ count);
        if ( count > 0){
            return new Result().build(200,"商品信息获取成功",count,goodsList);
        }
            return new Result().build(2001,"暂无数据");
    }

    @RequestMapping(value = "/getClassIfy",method = RequestMethod.GET)
    @ResponseBody
    public Result getClassIfy(){
        List<ClassIfy> classIfyList = classIfyService.finAllClassIfy();
        return new Result().build(200,"分区数据获取成功",classIfyList);
    }

    @RequestMapping(value = "/getGoodsType",method = RequestMethod.POST)
    @ResponseBody
    public Result getGoodsType(@RequestParam(value = "classIfyId", required = false)String classIfyId){
        System.err.println(classIfyId);
        List<GoodsType> goodsTypeList = goodsTypeService.finGoodsTypeByClassIfyId(classIfyId);
        return new Result().build(200,"分类数据获取成功",goodsTypeList);
    }
}
