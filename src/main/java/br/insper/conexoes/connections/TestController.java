package br.insper.conexoes.connections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello-world")
    public String teste() {
        return "hello-world";
    }

}
