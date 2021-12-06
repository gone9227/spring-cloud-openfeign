package com.msa.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "app-2")
public interface App2ServiceClient {

    @GetMapping("/{userId}/app-2")
    public App2ResponseDto getApp2(@PathVariable("userId") Long id);

    @PostMapping("/app-2")
    public App2ResponseDto addApp2(App1RequestDto requestDto);
}
