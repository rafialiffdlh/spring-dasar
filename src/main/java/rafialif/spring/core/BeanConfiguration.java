package rafialif.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import rafialif.spring.core.data.Foo;
@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean 
    public Foo foo() {
        Foo foo = new Foo ();
        log.info("buat baru foo");
        return foo;
    }
}