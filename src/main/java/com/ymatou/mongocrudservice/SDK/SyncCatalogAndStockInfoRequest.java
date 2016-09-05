package com.ymatou.mongocrudservice.SDK;

import java.util.List;

/**
 * 同步商品规格及库存
 * Created by chenpengxuan on 2016/9/5.
 */
public class SyncCatalogAndStockInfoRequest extends BaseRequestModel {

    /**
     * 商品id列表
     */
    public List<String> ProductIdList;

    @Override
    public void Validate() throws ApiException {
        if(ProductIdList == null || ProductIdList.isEmpty()){
            throw new ApiException("1001","商品id列表不能为空");
        }
    }
}
