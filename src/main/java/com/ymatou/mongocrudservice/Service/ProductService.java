package com.ymatou.mongocrudservice.Service;

import com.ymatou.mongocrudservice.Repository.ProductMongoRepository;
import com.ymatou.mongocrudservice.Repository.ProductRepository;
import com.ymatou.mongocrudservice.Repository.SellerInfoRepository;
import com.ymatou.mongocrudservice.domain.ProductBaseInfo;
import com.ymatou.mongocrudservice.domain.SellerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品相关业务
 * Created by chenpengxuan on 2016/8/31.
 */
@Service
public class ProductService {
    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMongoRepository productMongoRepository;

    /**
     * 获取买手信息
     *
     * @param userId
     * @return
     */
    public SellerInfo GetSellerInfo(Integer userId) {
        return sellerInfoRepository.getSellerInfo(userId);
    }

    /**
     * 同步商品规格库存
     *
     * @param productIdList
     */
    public void SyncCatalogAndStockInfo(List<String> productIdList) {
        productIdList.replaceAll(x -> x = "'" + x + "'");
        List<ProductBaseInfo> productBaseInfoList = productRepository.getProductBaseInfoList(String.join(",", productIdList));
        productBaseInfoList.forEach(x -> {
            if (x == null) { //如果sql库中商品不存在，则记录日志
                //ToDo:记录日志
            } else { //如果sql库中商品存在
                ProductBaseInfo tempBaseInfo = productMongoRepository.findByProductId(x.getProductId());
                if (tempBaseInfo == null) {//如果mongo库中商品不存在，则新建

                } else {//如果mongo库中存在，则更新

                }
            }
        });
    }
}
