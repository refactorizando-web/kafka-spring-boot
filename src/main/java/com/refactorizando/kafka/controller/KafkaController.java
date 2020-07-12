package com.refactorizando.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.refactorizando.kafka.kafka.producer.KafkaProducer;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class KafkaController {

  private final KafkaProducer kafkaProducer;


  @PostMapping("/messages/send")
  public ResponseEntity<String> sendMessage(@RequestBody  String message) {

    kafkaProducer.sendMessage(message);

    return ResponseEntity.ok(message);
  }

}
