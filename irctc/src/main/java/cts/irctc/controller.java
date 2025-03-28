package cts.irctc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/railway")
public class controller {

@GetMapping
public String get() {
    return "hello world";
}
@GetMapping("/welcome")
public String getWelcome() {
    return "welcome to railway";

}
}

