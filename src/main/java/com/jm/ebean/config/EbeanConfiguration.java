package com.jm.ebean.config;

import io.ebean.Database;
import io.ebean.DatabaseFactory;
import io.ebean.config.DatabaseConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EbeanConfiguration {
    @Bean
    public Database database() {
        DatabaseConfig config = new DatabaseConfig();
        config.loadFromProperties(); // załadowanie ustawień z properties dla aliasu db.
        config.setDefaultServer(true); // ustawienie tej bazy danych jako domyślny serwer
        return DatabaseFactory.create(config); // utworzenie dostępu do serwera bazy danych
    }
}
