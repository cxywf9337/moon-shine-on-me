package com.eric.moonshineonme.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@MapperScan("com.eric.moonshineonme.cm.mapper")
public class MybatisPlusConfig {
    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }

    /**
     * 公共字段自动填充
     * @return
     */
//    @Bean
//    public MetaObjectHandler metaObjectHandler(){
//        return new MyMetaObjectHandler();
//    }

    /**
     * 打印sql语句以及执行时间，生产环境关闭
     * @return
     */
    @Bean
    @Profile(value = "dev")//判断环境
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    /**
     * 自定义sql过滤器注入
     * @return DefaultSqlInjector
     *//*
    @Bean
    public DefaultSqlInjector defaultSqlInjector() {
        return new CustomDefaultSqlInjector();
    }*/
}
