package csmentor.csmentorapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String homepage(){
        return "SOMETHING ELSE";
    }

}
