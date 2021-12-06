package com.msa.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class App1ResponseDto {
    private String name;
    private App2ResponseDto app2ResponseDto;
}
