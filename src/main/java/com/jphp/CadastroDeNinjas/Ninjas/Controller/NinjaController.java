package com.jphp.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/")
    public String index() {
        return "Boas vindas";
    }
}
