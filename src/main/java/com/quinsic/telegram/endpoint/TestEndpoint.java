package com.quinsic.telegram.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
@Slf4j
public class TestEndpoint {

    @GetMapping
    public String test() {
        return "This is Test.";
    }
}
