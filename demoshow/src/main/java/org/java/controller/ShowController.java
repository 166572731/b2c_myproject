package org.java.controller;

import org.java.util.DemodeteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ShowController {
    @Autowired
    private DemodeteService demodeteService;
    @RequestMapping("/show/{name}")
    public Map show(@PathVariable("name") String name){
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Map map=new HashMap();
        System.out.println(demodeteService.show(name));
        System.out.println("ccccccccccccccccccccccccccc");
        map.put("url", name);
        map.put("prodouct", demodeteService.show(name));
        return map;
    }
}
