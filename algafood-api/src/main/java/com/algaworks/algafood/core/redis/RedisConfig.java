package com.algaworks.algafood.core.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.session.SessionRepository;

@Configuration
public class RedisConfig {

    @Bean
    @Profile("development")
    public SessionRepository<?> sessionRepository()
    {
        return null;
    }
}
