package com.poja.poja_big_sum_std22098.conf;

import com.poja.poja_big_sum_std22098.PojaGenerated;
import org.springframework.test.context.DynamicPropertyRegistry;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
