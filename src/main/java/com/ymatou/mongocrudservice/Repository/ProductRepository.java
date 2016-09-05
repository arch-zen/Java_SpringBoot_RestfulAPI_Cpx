package com.ymatou.mongocrudservice.Repository;

import com.ymatou.mongocrudservice.InfraStructure.TargetDataSource;
import com.ymatou.mongocrudservice.domain.ProductBaseInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 商品相关数据仓储
 * Created by chenpengxuan on 2016/9/5.
 */
public interface ProductRepository {
    /**
     * 获取
     * @param productIdList
     * @return
     */
    @TargetDataSource("productDataSource")
    @Select("SELECT sProductId AS productId" +
            " FROM " +
            "Ymt_Products  WITH(NOLOCK) " +
            "WHERE iAction>-1 " +
            "AND sProductId IN (${productIdList})")
    List<ProductBaseInfo> getProductBaseInfoList(@Param("productIdList") String productIdList);
}
