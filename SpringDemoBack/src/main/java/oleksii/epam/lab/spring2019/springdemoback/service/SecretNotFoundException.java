package oleksii.epam.lab.spring2019.springdemoback.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class SecretNotFoundException extends RuntimeException {
}
