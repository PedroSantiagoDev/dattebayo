package com.jphp.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {
    @GetMapping("listar")
    public String listar() {
        return "Missaoes listadas com sucesso";
    }

    @PostMapping("/criar")
    public String criar() {
        return "Missao criada com sucesso";
    }

    @PutMapping("/alterar")
    public String alterar() {
        return "Missao alterada com sucesso";
    }

    @DeleteMapping("/deletarID")
    public String deletar() {
        return "Missao deletada com sucesso";
    }
}
