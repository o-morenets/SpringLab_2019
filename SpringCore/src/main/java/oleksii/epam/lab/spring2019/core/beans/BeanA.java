package oleksii.epam.lab.spring2019.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class BeanA {

    @Autowired
    private BeanC beanC;
}
