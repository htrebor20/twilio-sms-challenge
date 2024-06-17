package com.pragma.twilio.twilio;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInitializer {
    private final TwilioConfig twilioConfig;
    private static final Logger LOGGER = LoggerFactory.getLogger(TwilioInitializer.class);

    public TwilioInitializer(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
        Twilio.init(
                twilioConfig.getAccountSid(),
                twilioConfig.getAuthToken()
        );
        LOGGER.info("Twilio initialized ... With account sid {} ", twilioConfig.getAccountSid());
    }
}

