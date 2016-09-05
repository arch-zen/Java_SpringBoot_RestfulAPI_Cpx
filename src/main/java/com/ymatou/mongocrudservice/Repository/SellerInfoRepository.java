package com.ymatou.mongocrudservice.Repository;

import com.ymatou.mongocrudservice.InfraStructure.TargetDataSource;
import com.ymatou.mongocrudservice.domain.SellerInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 买手信息repository
 * Created by chenpengxuan on 2016/8/31.
 */
public interface SellerInfoRepository {
    @TargetDataSource("baseDataSource")
    @Select("SELECT slogoUrl AS logoUrl," +
            " iuserId AS userId" +
            " FROM Ymt_UserLogo WITH(NOLOCK)" +
            " WHERE iuserId = #{userId}" +
            " AND iAction = 0")
    SellerInfo getSellerInfo(@Param("userId") Integer userId);
}
