package com.msa.app;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class App1Service {

    private final App2ServiceClient app2ServiceClient;

    public App1ResponseDto getApp2Info(Long userId){
        App2ResponseDto app2 = app2ServiceClient.getApp2(userId);
        return new App1ResponseDto("hello", app2);
    }

    public App1ResponseDto addApp2Info(App1RequestDto requestDto) {
        System.out.println("requestDto = " + requestDto);
        App2ResponseDto app2 = app2ServiceClient.addApp2(new App1RequestDto(requestDto.getName(), requestDto.getValue()));
        return new App1ResponseDto("Post test", app2);
    }
}
