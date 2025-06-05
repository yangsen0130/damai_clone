package com.damai.kafka;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @program: damai
 * @description: kafka topic
 * @author: yangsen
 **/
@Data
public class KafkaTopic {
    
    @Value("${spring.kafka.topic:default}")
    private String topic;

}
