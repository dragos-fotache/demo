package com.example.demo.config;

import com.example.demo.service.BoogieThing;
import com.example.lib.Library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@Import(Library.class)
public class GeneralConfig {

  @Bean
  @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
  public BoogieThing boogie() {
    return new BoogieThing("boogie");
  }

}
