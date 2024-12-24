package rafialif.spring.core.data;

import org.springframework.stereotype.Component;

import lombok.Getter;
import rafialif.spring.core.aware.IdAware;

@Component
public class Car implements IdAware {
  @Getter
  private String id;

  @Override
  public void setId(String id) {
    this.id = id;
  }
}
