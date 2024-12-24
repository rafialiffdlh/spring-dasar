package rafialif.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "rafialif.spring.core.configuration"
})
public class ScanConfiguration {
}
