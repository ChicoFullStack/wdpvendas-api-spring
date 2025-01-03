package com.willoja.wdpvendas.marca;

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
@RequestMapping("/marca")
public class MarcaController {

    @Autowired
    private MarcaService service;

    @GetMapping("/")
    public List<Marca> buscarTodos(){
        return service.buscaTodos();
    }

    @PostMapping("/")
    public Marca inserir(@RequestBody Marca obj){
        return service.inserir(obj);
    }

    @PutMapping("/")
    public Marca alterar(@RequestBody Marca obj){
        return service.alterar(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        service.excluir(id);
        return ResponseEntity.ok().build();
    }

}

