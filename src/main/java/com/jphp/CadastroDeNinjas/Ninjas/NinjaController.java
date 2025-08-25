package com.jphp.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class
NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @PostMapping("/criar")
    public String criar() {
        return "Criar Ninja";
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/listarID")
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
