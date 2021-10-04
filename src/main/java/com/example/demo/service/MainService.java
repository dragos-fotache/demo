package com.example.demo.service;

import java.util.List;

import com.example.demo.client.Demo2Client;
import com.example.demo.model.MyObj;
import com.example.demo.model.entity.Ssd;
import com.example.demo.repository.SsdRepository;
import com.example.lib.Library;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MainService {

  private final Library lib;

  private final SsdRepository ssdRepository;

  private final Demo2Client client;

  public MyObj doSomething() {

    lib.calculateStuff();

    String s = client.info();

    return MyObj.builder().field1("1111").field2("2222").field3(s).build();
  }

  public List<Ssd> findAllSsds() {

    List<Ssd> all = (List<Ssd>) ssdRepository.findAll();

    return all;
    
  }
}
