package com.msa.app;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class App1Controller {
    private final App1Service app1Service;

    // GET 테스트
    @GetMapping("/app-1/test/{userId}")
    public App1ResponseDto app1Test(@PathVariable("userId") Long userId){
        return app1Service.getApp2Info(userId);
    }

    // POST 테스트
    @PostMapping("/app-1/test")
    public App1ResponseDto app1PostTest(@RequestBody App1RequestDto requestDto){
        return app1Service.addApp2Info(requestDto);
    }
}
