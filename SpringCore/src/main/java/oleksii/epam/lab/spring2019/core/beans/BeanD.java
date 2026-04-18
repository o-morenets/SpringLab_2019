package oleksii.epam.lab.spring2019.core.beans;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeanD {

    @Autowired
    private Animal myDuck; // injection by @Bean("myDuck") name - field injection only

    @Autowired
    private @Qualifier("myRabbit") Animal myRabbit; // injection by @Qualifier("myRabbit") - field injection only

//    private final Animal teddyBear; // @Qualifier does not work with CONSTRUCTOR injection
}
