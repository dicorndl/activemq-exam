package me.dicorndl.activemqexam;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class Message {

  private final String id;

  private final String message;
}
