package com.example.demo.model;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MyObj {

  @NotBlank
  private String field1;
  @NotBlank
  private String field2;
  @NotBlank
  private String field3;
  
}
