package com.example.ex00.dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class QualifierTests {
    @Autowired
    @Qualifier("desktop")
    private Computer desktop;

    @Autowired
    @Qualifier("laptop")
    private Computer laptop;

    @Autowired
    private Computer computer;

    @Autowired
    @Qualifier("outback")
    private Restaurant outback;

    @Autowired
    private Restaurant vips;

//    @Autowired
//    private Restaurant restaurant;

    @Test
    public void qualifierTest(){
        log.info("---------------------------------");
        log.info("desktop : " + desktop.getScreenWidth());
        log.info("laptop : " + laptop.getScreenWidth());
        log.info("computer : " + computer.getScreenWidth());
        log.info("---------------------------------");

        log.info("---------------------------------");
        log.info("outback : " + outback.hasSalad());
        log.info("vips : " + vips.hasSalad());
        log.info("steak price : " + Restaurant.steak);
        log.info("---------------------------------");
    }

}
