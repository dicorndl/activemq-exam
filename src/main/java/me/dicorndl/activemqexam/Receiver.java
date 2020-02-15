package me.dicorndl.activemqexam;

import java.util.concurrent.CountDownLatch;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Receiver {

  @Getter
  private CountDownLatch latch = new CountDownLatch(1);

  @JmsListener(destination = "helloworld.q")
  public void receive(@Payload Message message) {
    log.info("Recieved message = {}", message);
    latch.countDown();
  }
}
