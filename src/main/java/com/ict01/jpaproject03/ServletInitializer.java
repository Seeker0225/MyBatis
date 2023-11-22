package com.ict01.jpaproject03;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(Jpaproject03Application.class); // Spring Boot 애플리케이션의 주요 소스를 설정
  }

}
