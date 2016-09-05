package com.ymatou.mongocrudservice.Controller;

import com.ymatou.mongocrudservice.SDK.ApiException;
import com.ymatou.mongocrudservice.SDK.BaseResponseModel;
import com.ymatou.mongocrudservice.SDK.SyncCatalogAndStockInfoRequest;
import com.ymatou.mongocrudservice.Service.ProductService;
import com.ymatou.mongocrudservice.domain.SellerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 商品相关服务
 * Created by chenpengxuan on 2016/8/31.
 */
@RestController
@RequestMapping(value = "/Api/Product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 获取商品信息
     * @param userIdMap
     * @return
     */
    @RequestMapping(value = "/GetProductInfo",method = RequestMethod.POST)
    @ResponseBody
    public SellerInfo GetProductInfo(@RequestBody Map<String,Integer> userIdMap){
        return  productService.GetSellerInfo(userIdMap.get("userId"));
    }

    /**
     * 同步商品规格及库存
     * @return
     */
    @RequestMapping(value = "/SyncCatalogAndStockInfo",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseModel SyncCatalogAndStockInfo(@RequestBody SyncCatalogAndStockInfoRequest request){
        BaseResponseModel response = new BaseResponseModel();
        try{
            request.Validate();
            productService.SyncCatalogAndStockInfo(request.ProductIdList);
        }catch (ApiException ex){
            response.BusinessCode = ex.getErrorCode();
            response.Code = 0;
            response.Msg = ex.getErrorMsg();
        }
        return response;
    }
}
