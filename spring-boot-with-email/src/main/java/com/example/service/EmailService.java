package com.example.service;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.template.PebbleTemplate;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

  private static final Logger LOG = LoggerFactory.getLogger(EmailService.class);
  private final PebbleEngine pebbleEngine;

  public EmailService(PebbleEngine pebbleEngine) {
    this.pebbleEngine = pebbleEngine;
  }

  public void sendEmail(String comment) {
    PebbleTemplate template = this.pebbleEngine.getTemplate("email/email");

    Map<String, Object> context = new HashMap<>();
    context.put("comment", comment);
    Writer writer = new StringWriter();

    try {
      template.evaluate(writer, context);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    LOG.info("Send email with content={}", writer.toString());
  }
}
