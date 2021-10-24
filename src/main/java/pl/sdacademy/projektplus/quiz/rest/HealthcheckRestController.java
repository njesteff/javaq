package pl.sdacademy.projektplus.quiz.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sdacademy.projektplus.quiz.dto.HealthcheckDto;

@RestController
@RequestMapping("/api/healthcheck")
public class HealthcheckRestController {

    @GetMapping
    public HealthcheckDto healthcheck() {
        HealthcheckDto dto = new HealthcheckDto(true, "It's working!");
        return dto;
    }
}
