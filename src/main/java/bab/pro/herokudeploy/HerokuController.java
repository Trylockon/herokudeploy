package bab.pro.herokudeploy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HerokuController {

    @RequestMapping("/hello")
    public String helloHeroku(){
        return "Hello, heroku!";
    }
}
