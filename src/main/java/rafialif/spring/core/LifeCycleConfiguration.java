package rafialif.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rafialif.spring.core.data.Connection;
import rafialif.spring.core.data.Server;

@Configuration
public class LifeCycleConfiguration {
  @Bean
  public Connection connection(){
    return new Connection();
  }

  @Bean
  public Server server(){
    return new Server();
  }
}
