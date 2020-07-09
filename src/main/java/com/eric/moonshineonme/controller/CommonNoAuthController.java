package com.eric.moonshineonme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Description:
 * </P>
 *
 * @author wangfei
 * @since 2020-07-09
 */
@RestController
@RequestMapping("/common")
public class CommonNoAuthController {

    @GetMapping("/greet/hi")
    public String sayHiToMe(@RequestParam("greeting") String greeting) {
        return "Hi, " + greeting + " too.";
    }

}
