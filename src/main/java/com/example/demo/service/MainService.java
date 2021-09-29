package com.example.demo.service;

import java.util.List;

import com.example.demo.model.MyObj;
import com.example.demo.model.entity.Ssd;
import com.example.demo.repository.SsdRepository;
import com.example.lib.Library;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class MainService {

  private final Library lib;

  private final SsdRepository ssdRepository;

  public MyObj doSomething(MyObj o) {

    lib.calculateStuff();

    return MyObj.builder().field1("1111").field2("2222").field3("3333").build();
  }

  public List<Ssd> findAllSsds() {

    List<Ssd> all = (List<Ssd>) ssdRepository.findAll();

    return all;
    
  }
}
