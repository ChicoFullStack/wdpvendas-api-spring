package com.willoja.wdpvendas.subcategoria;

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
@RequestMapping("/sub_categoria")
public class SubCategoriaController {

    @Autowired
    private SubCategoriaService service;

    @GetMapping("/")
    public List<SubCategoria> buscarTodos(){
        return service.buscaTodos();
    }

    @PostMapping("/")
    public SubCategoria inserir(@RequestBody SubCategoria obj){
        return service.inserir(obj);
    }

    @PutMapping("/")
    public SubCategoria alterar(@RequestBody SubCategoria obj){
        return service.alterar(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        service.excluir(id);
        return ResponseEntity.ok().build();
    }

}

