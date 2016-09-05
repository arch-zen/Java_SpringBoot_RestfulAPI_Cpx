package com.ymatou.mongocrudservice.domain;

import net.sourceforge.jtds.jdbc.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by chenpengxuan on 2016/9/5.
 */
@Document(collection = "ProductBasicInfo")
public class ProductBaseInfo {
    @Id
    private String id;

    /**
     * 商品编号
     */
    @Field("ProdId")
    private Integer prodId;

    /**
     * 商品GUID
     */
    @Field("ProductId")
    private String productId;

    /**
     * 商品名称
     */
    @Field("Name")
    private String name;

    /**
     * 商品主要图片
     */
    @Field("MainPicUrl")
    private String mainPicUrl;

    /**
     * 商品副标题
     */
    @Field("ProductSubTitle")
    private String productSubTitle;

    /**
     * 商品短标题
     */
    @Field("ProductShortName")
    private String productShortName;

    /**
     * 介绍图片列表（多个图片用逗号隔开）
     */
    @Field("PicList")
    private String picList;

    /**
     * 现场图片列表
     */
    @Field("LivePicList")
    private List<String> livePicList;

    /**
     * 有效开始时间（年月日时分秒）
     */
    @Field("ValidStart")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime validStart;

    /**
     * 有效结束时间（年月日时分秒）
     */
    @Field("ValidEnd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime validEnd;

    /**
     * 限购数量(0 为不限购)
     */
    @Field("LimitNum")
    private int limitNum;

    /**
     * 限购开始时间
     */
    @Field("LimitNumStartTime")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime limitNumStartTime;

    /**
     * 最低规格价格
     */
    @Field("MinCatalogPrice")
    private BigDecimal minCatalogPrice;

    /**
     * 最高规格价格
     */
    @Field("MaxCatalogPrice")
    private BigDecimal maxCatalogPrice;

    /**
     * 卖家用户编号
     */
    @Field("SellerId")
    private int sellerId;

    /**
     * 卖家用户账号
     */
    @Field("SellerName")
    private String sellerName;

    /**
     * 买手头像
     */
    @Field("SellerLogo")
    private String sellerLogo;

    /**
     *
     */
    @Field("IsLiveProduct")
    private boolean isLiveProduct;

    /**
     * 是否放入仓库
     */
    @Field("IsMallProduct")
    private boolean isMallProduct;

    /**
     * 回播商品的原始商品编号
     */
    @Field("OriginalProductId")
    private String originalProductId;

    /**
     * 商品品牌编号
     */
    @Field("BrandId")
    private int brandId;

    /**
     * 商品品牌名称（中）
     */
    @Field("BrandName")
    private String brandName;

    /**
     * 商品品牌名称（英）
     */
    @Field("BrandEnName")
    private String brandEnName;

    /**
     * 一级分类编号
     */
    @Field("MasterCategoryId")
    private int masterCategoryId;

    /**
     * 一级分类名称
     */
    @Field("MasterCategoryName")
    private String masterCategoryName;

    /**
     * 二级分类编号
     */
    @Field("CategoryId")
    private int categoryId;

    /**
     * 二级分类名称
     */
    @Field("CategoryName")
    private String categoryName;

    /**
     * 三级分类编号
     */
    @Field("ThirdCategoryId")
    private int thirdCategoryId;

    /**
     * 三级分类名称
     */
    @Field("ThirdCategoryName")
    private String thirdCategoryName;

    /**
     * 备货状态（0-现货，1-代购，2-FBX商品）
     */
    @Field("CatalogType")
    private int catalogType;

    /**
     * 物流类型（1. 官方物流，2. 非官方物流）
     */
    @Field("LogisticsType")
    private int logisticsType;

    /**
     * 发货类型（1.国内、2.海外直邮、3.贝海直邮、4.商家保税、5.贝海保税、6.海外认证直邮、7.海外拼邮）
     */
    @Field("DeliveryMethod")
    private int deliveryMethod;

    /**
     * 保税区（1.广州，2.宁波，3.杭州，4.郑州，5.天津，6.重庆，7.深圳，8.上海）
     */
    @Field("BondedArea")
    private int bondedArea;

    /**
     * 默认运费
     */
    @Field("Freight")
    private BigDecimal freight;

    /**
     * 运费模板编号
     */
    @Field("DeliveryTemplateId")
    private String deliveryTemplateId;

    /**
     * 重量
     */
    @Field("Weight")
    private BigDecimal weight;

    /**
     * 交税方（0. 卖家交税，1. 买家交税）
     */
    @Field("TariffType")
    private int tariffType;

    /**
     * 卖家居住国家
     */
    @Field("SellerCountry")
    private int sellerCountry;

    /**
     * 目前商家共有4个等级， TOP,PRO,SEMI,BLACK-LIST
     */
    @Field("SellerLevel")
    private String sellerLevel;

    /**
     * 商品所属国家
     */
    @Field("ProductCountry")
    private int productCountry;

    /**
     * 国家中文名称
     */
    @Field("Country")
    private String country;

    /**
     * 国旗
     */
    @Field("Flag")
    private String flag;

    /**
     * 记录更新数据
     */
    @Field("LastRefreshTime")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime lastRefreshTime;

    /**
     * 商品创建时间
     */
    @Field("AddTime")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime addTime;

    /**
     * 退货条件（0.有条件退货，1.可以退货）
     */
    @Field("AcceptReturn")
    private int acceptReturn;

    /**
     * 状态(1. 正常、2.售罄、3.已删除、4.不可售)
     */
    @Field("Status")
    private int status;

    /**
     * 状态（兼容老应用， -1 删除， 0 有效）
     */
    @Field("Action")
    private int action;

    /**
     * 是否新结构化描述
     */
    @Field("IsNewDesc")
    private boolean isNewDesc;

    /**
     * 备货所在地
     */
    @Field("InventoryLocation")
    private int inventoryLocation;

    /**
     * 配送方式
     */
    @Field("LogisticsChannel")
    private int logisticsChannel;

    /**
     * 本土退货 1，官方本土退货 2
     */
    @Field("LocalReturn")
    private int localReturn;

    /**
     *
     */
    @Field("NoticeRisk")
    private boolean noticeRisk;

    /**
     * FBX商品的商品备案号
     */
    @Field("ProductCode")
    private String productCode;

    /**
     * 七天无理由
     */
    @Field("NoReasonReturn")
    private boolean noReasonReturn;

    /**
     * 手机端文描
     */
    @Field("MobileDescription")
    private String mobileDescription;

    /**
     * 自动转长期销售
     */
    @Field("AutoLongSale")
    private boolean autoLongSale;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainPicUrl() {
        return mainPicUrl;
    }

    public void setMainPicUrl(String mainPicUrl) {
        this.mainPicUrl = mainPicUrl;
    }

    public String getProductSubTitle() {
        return productSubTitle;
    }

    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }

    public String getProductShortName() {
        return productShortName;
    }

    public void setProductShortName(String productShortName) {
        this.productShortName = productShortName;
    }

    public String getPicList() {
        return picList;
    }

    public void setPicList(String picList) {
        this.picList = picList;
    }

    public List<String> getLivePicList() {
        return livePicList;
    }

    public void setLivePicList(List<String> livePicList) {
        this.livePicList = livePicList;
    }

    public DateTime getValidStart() {
        return validStart;
    }

    public void setValidStart(DateTime validStart) {
        this.validStart = validStart;
    }

    public DateTime getValidEnd() {
        return validEnd;
    }

    public void setValidEnd(DateTime validEnd) {
        this.validEnd = validEnd;
    }

    public int getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(int limitNum) {
        this.limitNum = limitNum;
    }

    public DateTime getLimitNumStartTime() {
        return limitNumStartTime;
    }

    public void setLimitNumStartTime(DateTime limitNumStartTime) {
        this.limitNumStartTime = limitNumStartTime;
    }

    public BigDecimal getMinCatalogPrice() {
        return minCatalogPrice;
    }

    public void setMinCatalogPrice(BigDecimal minCatalogPrice) {
        this.minCatalogPrice = minCatalogPrice;
    }

    public BigDecimal getMaxCatalogPrice() {
        return maxCatalogPrice;
    }

    public void setMaxCatalogPrice(BigDecimal maxCatalogPrice) {
        this.maxCatalogPrice = maxCatalogPrice;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerLogo() {
        return sellerLogo;
    }

    public void setSellerLogo(String sellerLogo) {
        this.sellerLogo = sellerLogo;
    }

    public boolean isLiveProduct() {
        return isLiveProduct;
    }

    public void setLiveProduct(boolean liveProduct) {
        isLiveProduct = liveProduct;
    }

    public boolean isMallProduct() {
        return isMallProduct;
    }

    public void setMallProduct(boolean mallProduct) {
        isMallProduct = mallProduct;
    }

    public String getOriginalProductId() {
        return originalProductId;
    }

    public void setOriginalProductId(String originalProductId) {
        this.originalProductId = originalProductId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandEnName() {
        return brandEnName;
    }

    public void setBrandEnName(String brandEnName) {
        this.brandEnName = brandEnName;
    }

    public int getMasterCategoryId() {
        return masterCategoryId;
    }

    public void setMasterCategoryId(int masterCategoryId) {
        this.masterCategoryId = masterCategoryId;
    }

    public String getMasterCategoryName() {
        return masterCategoryName;
    }

    public void setMasterCategoryName(String masterCategoryName) {
        this.masterCategoryName = masterCategoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getThirdCategoryId() {
        return thirdCategoryId;
    }

    public void setThirdCategoryId(int thirdCategoryId) {
        this.thirdCategoryId = thirdCategoryId;
    }

    public String getThirdCategoryName() {
        return thirdCategoryName;
    }

    public void setThirdCategoryName(String thirdCategoryName) {
        this.thirdCategoryName = thirdCategoryName;
    }

    public int getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(int catalogType) {
        this.catalogType = catalogType;
    }

    public int getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(int logisticsType) {
        this.logisticsType = logisticsType;
    }

    public int getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(int deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public int getBondedArea() {
        return bondedArea;
    }

    public void setBondedArea(int bondedArea) {
        this.bondedArea = bondedArea;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getDeliveryTemplateId() {
        return deliveryTemplateId;
    }

    public void setDeliveryTemplateId(String deliveryTemplateId) {
        this.deliveryTemplateId = deliveryTemplateId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public int getTariffType() {
        return tariffType;
    }

    public void setTariffType(int tariffType) {
        this.tariffType = tariffType;
    }

    public int getSellerCountry() {
        return sellerCountry;
    }

    public void setSellerCountry(int sellerCountry) {
        this.sellerCountry = sellerCountry;
    }

    public String getSellerLevel() {
        return sellerLevel;
    }

    public void setSellerLevel(String sellerLevel) {
        this.sellerLevel = sellerLevel;
    }

    public int getProductCountry() {
        return productCountry;
    }

    public void setProductCountry(int productCountry) {
        this.productCountry = productCountry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public DateTime getLastRefreshTime() {
        return lastRefreshTime;
    }

    public void setLastRefreshTime(DateTime lastRefreshTime) {
        this.lastRefreshTime = lastRefreshTime;
    }

    public DateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(DateTime addTime) {
        this.addTime = addTime;
    }

    public int getAcceptReturn() {
        return acceptReturn;
    }

    public void setAcceptReturn(int acceptReturn) {
        this.acceptReturn = acceptReturn;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public boolean isNewDesc() {
        return isNewDesc;
    }

    public void setNewDesc(boolean newDesc) {
        isNewDesc = newDesc;
    }

    public int getInventoryLocation() {
        return inventoryLocation;
    }

    public void setInventoryLocation(int inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public int getLogisticsChannel() {
        return logisticsChannel;
    }

    public void setLogisticsChannel(int logisticsChannel) {
        this.logisticsChannel = logisticsChannel;
    }

    public int getLocalReturn() {
        return localReturn;
    }

    public void setLocalReturn(int localReturn) {
        this.localReturn = localReturn;
    }

    public boolean isNoticeRisk() {
        return noticeRisk;
    }

    public void setNoticeRisk(boolean noticeRisk) {
        this.noticeRisk = noticeRisk;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public boolean isNoReasonReturn() {
        return noReasonReturn;
    }

    public void setNoReasonReturn(boolean noReasonReturn) {
        this.noReasonReturn = noReasonReturn;
    }

    public String getMobileDescription() {
        return mobileDescription;
    }

    public void setMobileDescription(String mobileDescription) {
        this.mobileDescription = mobileDescription;
    }

    public boolean isAutoLongSale() {
        return autoLongSale;
    }

    public void setAutoLongSale(boolean autoLongSale) {
        this.autoLongSale = autoLongSale;
    }
}
