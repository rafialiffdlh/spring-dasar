package rafialif.spring.core.data.cyclic;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicA {
    public CyclicB cyclicB;
}
