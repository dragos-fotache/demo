package com.example.demo.controller;

import javax.validation.Valid;

import com.example.demo.model.MyObj;
import com.example.demo.service.MainService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeController {

  private final MainService mainService;

  @PostMapping("hello")
  public MyObj hello(@RequestBody @Valid MyObj o) {

    return mainService.doSomething(o);

  }
}
