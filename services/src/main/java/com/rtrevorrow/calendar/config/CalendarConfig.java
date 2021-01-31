package com.rtrevorrow.calendar.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        value = {
                "com.rtrevorrow.calendar.repository"
        },
        repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class
)
@EntityScan(basePackages={
        "com.rtrevorrow.calendar.model",
})
@ComponentScan(
        basePackages={
                "com.rtrevorrow.calendar",
                "com.rtrevorrow.calendar.authentication",
                "com.rtrevorrow.calendar.config",
                "com.rtrevorrow.calendar.model",
                "com.rtrevorrow.calendar.repository",
                "com.rtrevorrow.calendar.service"
        }
)
//@EnableAutoConfiguration
public class CalendarConfig {


}
