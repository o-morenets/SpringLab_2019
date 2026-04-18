package oleksii.epam.lab.spring2019.core.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean("myDuck")
    public Animal duck() {
        return new Duck();
    }

    @Bean
    @Qualifier("myRabbit")
    public Animal rabbit() {
        return new Rabbit();
    }

    @Bean
    @Qualifier("teddyBear")
    public Animal bear() {
        return new Bear();
    }
}
