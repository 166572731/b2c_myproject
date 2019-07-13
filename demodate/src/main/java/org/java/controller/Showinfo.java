package org.java.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class Showinfo {
    @Value("${dev}")
    String dev;
    @Value("${server.port}")
    String port;

    @RequestMapping("/show/{name}")
    public Map show(@PathVariable("name") String name) {
        System.out.println(dev);
        System.out.println(name);
        //int a=1/0;
        Map map = new HashMap();
        map.put("aaa", "哈哈哈");
        map.put("aaa", "aaaaaaaa");
        map.put("name", name);
        map.put("dev", dev);
        map.put("port", port);
        return map;
    }

    @RequestMapping("/repshow/{name}")
    public Map repshow(@PathVariable("name") String name, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String sessionID = session.getId();
        System.out.println(session.getId());
        System.out.println(name);
        Map map = new HashMap();
        map.put("sessionID", sessionID);
        return map;
    }
}
