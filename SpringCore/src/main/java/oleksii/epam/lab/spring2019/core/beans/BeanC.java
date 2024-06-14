package oleksii.epam.lab.spring2019.core.beans;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
@RequiredArgsConstructor
public class BeanC {

    @Autowired
    private Animal cat; // injection by name

    private final Animal dog; // injection by name
}
