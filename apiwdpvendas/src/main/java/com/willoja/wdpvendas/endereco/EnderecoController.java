package com.willoja.wdpvendas.endereco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/")
    public List<Endereco> buscarTodos() {
        return enderecoService.buscarTodos();
    }

    @PostMapping("/")
    public Endereco inserir(@RequestBody Endereco objeto) {
        return enderecoService.inserir(objeto);
    }

    @PutMapping("/")
    public Endereco alterar(@RequestBody Endereco objeto) {
        return enderecoService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        enderecoService.excluir(id);
        return ResponseEntity.ok().build();
    }

}
