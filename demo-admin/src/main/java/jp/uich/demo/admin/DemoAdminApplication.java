package jp.uich.demo.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class DemoAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoAdminApplication.class, args);
  }
}
