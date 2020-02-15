package me.dicorndl.activemqexam;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class Sender {

  private final JmsTemplate jmsTemplate;

  public void send(Message message) {
    log.info("Send message = {}", message);
    jmsTemplate.convertAndSend("helloworld.q", message);
  }
}
