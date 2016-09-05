package com.ymatou.mongocrudservice.domain;

import java.io.Serializable;

/**
 * Created by chenpengxuan on 2016/8/31.
 */
public class SellerInfo implements Serializable {

    private static final long serialVersionUID = 2390301107654279369L;

    /**
     * 买手id
     */
    private  Integer userId;

    /**
     * 买手用户头像
     */
    private  String logoUrl;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
