package com.ditto.vo;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo<T> {
    private Integer statusCode;
    private String message;
    private T data;
}