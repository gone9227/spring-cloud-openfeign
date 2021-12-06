package com.msa.app;

import org.springframework.web.bind.annotation.*;

@RestController
public class App2Controller {

    @GetMapping("/{userId}/app-2")
    public App2ResponseDto app2Test(@PathVariable("userId") Long userId){
        return new App2ResponseDto(userId, "App2 Response Success!");
    }

    @PostMapping("/app-2")
    public App2ResponseDto app2PostTest(@RequestBody App1RequestDto app1RequestDto){
        return new App2ResponseDto(10L, app1RequestDto.getName() + " " + app1RequestDto.getValue());
    }
}
