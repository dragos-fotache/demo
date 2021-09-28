package com.example.demo.service;

import com.example.demo.model.MyObj;
import com.example.lib.Library;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class MainService {

  private final Library lib;

  @Value("${testKey}")
  private String s;

  public MyObj doSomething(MyObj o) {

    log.debug("got value: " + s);

    lib.calculateStuff();

    return MyObj.builder().field1("1111").field2("2222").field3("3333").build();
  }
}
