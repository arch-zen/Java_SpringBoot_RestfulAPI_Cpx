package com.ymatou.mongocrudservice.config;


import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * jdbc数据源配置
 * Created by chenpengxuan on 2016/8/31.
 */
@Configuration
public class DruidSetting {
    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/monitor/*");
        //去掉重置的开关
        servletRegistrationBean.addInitParameter("resetEnable","false");
        return servletRegistrationBean;
    }

    /**
     * 使用动态注册多数据源的方式替换只能注册一个数据源的方式
     * @return
     */
//    @Deprecated
//    @Bean(name="productDataSource")
//    public DataSource dataSource(@Value("${spring.datasource.productDataSource.driver-class-name}") String driver,
//                                      @Value("${spring.datasource.productDataSource.url}") String url,
//                                      @Value("${spring.datasource.productDataSource.username}") String username,
//                                      @Value("${spring.datasource.productDataSource.password}") String password,
//                                      @Value("${spring.datasource.productDataSource.initialSize}") Integer initialSize,
//                                      @Value("${spring.datasource.productDataSource.minIdle}") Integer minIdle,
//                                      @Value("${spring.datasource.productDataSource.maxActive}") Integer maxActive,
//                                      @Value("${spring.datasource.productDataSource.maxWait}") Integer maxWait,
//                                      @Value("${spring.datasource.productDataSource.timeBetweenEvictionRunsMillis}") Integer timeBetweenEvictionRunsMillis,
//                                      @Value("${spring.datasource.productDataSource.minEvictableIdleTimeMillis}") Integer minEvictableIdleTimeMillis,
//                                      @Value("${spring.datasource.productDataSource.testWhileIdle}") boolean testWhileIdle,
//                                      @Value("${spring.datasource.productDataSource.testOnBorrow}") boolean testOnBorrow) {
//        DruidDataSource productDataSource = new DruidDataSource();
//        productDataSource.setDriverClassName(driver);
//        productDataSource.setUrl(url);
//        productDataSource.setUsername(username);
//        productDataSource.setPassword(password);
//        productDataSource.setValidationQuery("SELECT 'X'");
//        productDataSource.setInitialSize(initialSize);
//        productDataSource.setMinIdle(minIdle);
//        productDataSource.setMaxActive(maxActive);
//        productDataSource.setMaxWait(maxWait);
//        productDataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//        productDataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//        productDataSource.setTestWhileIdle(testWhileIdle);
//        productDataSource.setTestOnBorrow(testOnBorrow);
//        try {
//            productDataSource.setFilters("stat, wall");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return productDataSource;
//    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
