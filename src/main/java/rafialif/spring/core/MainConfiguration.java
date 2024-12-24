package rafialif.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import rafialif.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
})
public class MainConfiguration {
}
