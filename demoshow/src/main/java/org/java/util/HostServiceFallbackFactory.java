package org.java.util;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HostServiceFallbackFactory implements FallbackFactory<DemodeteService> {

    @Override
    public DemodeteService create(Throwable throwable) {
        return new DemodeteService() {
            @Override
            public String show(String name) {
                return "服务异常"+name;
            }
        };
    }
}
