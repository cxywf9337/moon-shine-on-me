package com.eric.moonshineonme.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * <p>
 * Description: for test jenkins
 * </P>
 *
 * @author wangfei
 * @since 2020-06-17
 */
@Order(0)
@Component
public class StartUpLineRunner implements CommandLineRunner {

    Logger log = LoggerFactory.getLogger(StartUpLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            log.info("My project moon-shine-on-me is running 2.");
            Thread.sleep(10 * 1000L);
        }
    }
}
