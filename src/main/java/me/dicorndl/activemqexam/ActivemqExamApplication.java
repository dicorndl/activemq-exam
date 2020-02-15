package me.dicorndl.activemqexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqExamApplication {

  public static void main(String[] args) {
    SpringApplication.run(ActivemqExamApplication.class, args);
  }

}
