package com.spring.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitAndDestroyBean implements InitializingBean, DisposableBean{

    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("start");
    }

    @Override
    public void destroy() throws Exception {
        System.err.println("end");
    }

    void start(){
        System.err.println("start method");
    }
    
    void end(){
        System.err.println("end method");
    }
}