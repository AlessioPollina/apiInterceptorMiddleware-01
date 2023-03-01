package co.develhope.apiInterceptorMiddleware01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping("")
    public LocalDateTime getDateAndTime(){
        return LocalDateTime.now();
    }

}
