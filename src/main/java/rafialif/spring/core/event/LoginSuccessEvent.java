package rafialif.spring.core.event;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import rafialif.spring.core.data.User;

public class LoginSuccessEvent extends ApplicationEvent {

  @Getter
  private final User user;

  public LoginSuccessEvent(User user){
    super(user);
    this.user = user;
  }

}
