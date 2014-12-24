package app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class ApiController {

    @RequestMapping("/api/ping")
    public Ping ping(){
        return new Ping("Welcome to dropping");
    }

}