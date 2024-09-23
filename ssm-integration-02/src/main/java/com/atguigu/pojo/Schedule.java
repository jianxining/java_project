package com.atguigu.pojo;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Schedule {
    private Integer id;
    @NotBlank
    private String title;
    @NotNull
    private Boolean completed;
}