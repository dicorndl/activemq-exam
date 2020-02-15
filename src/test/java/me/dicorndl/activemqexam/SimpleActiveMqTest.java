package me.dicorndl.activemqexam;

import static org.assertj.core.api.Assertions.*;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SimpleActiveMqTest {

  @Autowired
  private Sender sender;

  @Autowired
  private Receiver receiver;

  @Test
  void testReceive() throws InterruptedException {
    sender.send(new Message(UUID.randomUUID().toString(), "Test message"));

    receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    assertThat(receiver.getLatch().getCount()).isEqualTo(0);
  }
}
