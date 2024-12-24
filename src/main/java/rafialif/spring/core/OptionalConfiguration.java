package rafialif.spring.core;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import rafialif.spring.core.data.Bar;
import rafialif.spring.core.data.Foo;
import rafialif.spring.core.data.FooBar;

@Configuration
public class OptionalConfiguration {

  @Bean
  public Foo foo(){
    return new Foo();
  }

  @Bean
  public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
    return new FooBar(foo.orElse(null), bar.orElse(null));
  }
}
