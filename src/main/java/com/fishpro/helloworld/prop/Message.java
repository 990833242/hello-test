package com.fishpro.helloworld.prop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * TODO DESC
 *
 * @author Crux
 * @since 2022/01/15 20:20:01
 */

@Data
@Configuration
public class Message {

    @Value("${message.result: apollo未开启}")
    private String result;
}
