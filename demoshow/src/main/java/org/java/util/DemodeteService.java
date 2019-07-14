package org.java.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Component
@FeignClient(value = "demodate-service",url = "http://ganzuul.free.idcfengye.com/demodate",fallbackFactory = HostServiceFallbackFactory.class)
public interface DemodeteService {
    @RequestMapping("/show/{name}")
    String show(@RequestParam("name") String name);
}
