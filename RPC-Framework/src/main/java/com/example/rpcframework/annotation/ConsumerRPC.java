package com.example.rpcframework.annotation;

import com.example.rpcframework.consumer.ConsumerBeanProcessor;
import org.springframework.context.annotation.Import;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 将ConsumerBeanProcessor装入Bean
 * 开启Consumer Bean的初始化Bean回调处理*/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(ConsumerBeanProcessor.class)
public @interface ConsumerRPC {
}