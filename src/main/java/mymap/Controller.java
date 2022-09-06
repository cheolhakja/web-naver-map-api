package mymap;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/list")
    public String cafeList() {
        return "list";
    }
}
