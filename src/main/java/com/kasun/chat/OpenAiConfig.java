package com.kasun.chat;

import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAiConfig  {
   /* @Bean
    public OpenAiChatClient chatClient(OpenAiApi openAiApi) {
        return new OpenAiChatClient(openAiApi, RetryPolicy.none()); // Disable retries
    }*/
}
