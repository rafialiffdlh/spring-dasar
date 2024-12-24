package rafialif.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import rafialif.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "rafialif.spring.core.repository",
    "rafialif.spring.core.service",
    "rafialif.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
