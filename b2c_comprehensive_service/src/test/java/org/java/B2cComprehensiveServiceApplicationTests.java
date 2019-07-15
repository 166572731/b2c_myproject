package org.java;

import org.java.service.Demotest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class B2cComprehensiveServiceApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    Demotest demotest;
    @Test
    public void selectUser(){
        System.out.println(demotest.selectByPrimaryKey(2));
    }
}
