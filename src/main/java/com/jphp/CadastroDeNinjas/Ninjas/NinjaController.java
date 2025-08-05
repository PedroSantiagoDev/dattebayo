package com.jphp.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ninjas")
public class NinjaController {
    @PostMapping("/criar")
    public String criar() {
        return "Criar Ninja";
    }

    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "mostrar todos os ninjas";
    }

    @GetMapping("/todosID")
    public String mostraTodosOsNinjasPorId() {
        return "mostrar todos os ninjas por id";
    }

    @PutMapping("/alterarID")
    public String alterarNinjasPorId() {
        return "alterar os dados de um ninja por id";
    }

    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "deletando ninja por id";
    }
}
