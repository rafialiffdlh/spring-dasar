package rafialif.spring.core.data.cyclic;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicB {
    public CyclicC cyclicC;
}
