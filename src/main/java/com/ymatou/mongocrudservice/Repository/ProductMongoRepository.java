package com.ymatou.mongocrudservice.Repository;

import com.ymatou.mongocrudservice.domain.ProductBaseInfo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 商品mongoRepository
 * Created by chenpengxuan on 2016/9/5.
 */
public interface ProductMongoRepository  extends MongoRepository<ProductBaseInfo,ObjectId> {
    /**
     * 获取商品信息
     * @param productId
     * @return
     */
    ProductBaseInfo findByProductId(String productId);
}
