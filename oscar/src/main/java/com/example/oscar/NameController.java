package com.example.oscar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class NameController {

    @GetMapping("/name")
    public String getMyName() {
        return "Oscar Alberto Monterroso Vasquez";
    }
}
    