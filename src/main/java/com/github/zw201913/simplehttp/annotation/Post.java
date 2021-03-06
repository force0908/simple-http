package com.github.zw201913.simplehttp.annotation;

import com.github.zw201913.simplehttp.core.factory.BaseOkHttpClientFactory;
import com.github.zw201913.simplehttp.core.factory.DefaultOkHttpClientFactory;
import com.github.zw201913.simplehttp.core.handler.RequestParamsHandler;
import com.github.zw201913.simplehttp.core.handler.SimpleJsonRequestParamsHandler;
import org.apache.commons.lang3.StringUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 注解Post请求方法 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Post {
    /**
     * 请求url
     *
     * @return
     */
    String value() default StringUtils.EMPTY;

    /**
     * 指定创建OkHttpClient的工厂类
     *
     * @return
     */
    Class<? extends BaseOkHttpClientFactory> clientFactory() default
            DefaultOkHttpClientFactory.class;

    /**
     * 使用自定义的RequestParamsHandler，否则就用默认的
     *
     * @return
     */
    Class<? extends RequestParamsHandler> handler() default SimpleJsonRequestParamsHandler.class;
}
