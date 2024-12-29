package com.willoja.wdpvendas.categoria;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public List<Categoria> buscaTodos() {
        return repo.findAll();
    }

    public Categoria inserir(Categoria obj) {
        obj.setDataCriacao(new Date());
        Categoria objNovo = repo.saveAndFlush(obj);
        return objNovo;

    }

    public Categoria alterar(Categoria obj) {
        obj.setDataAtualizacao(new Date());
        return repo.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Categoria obj = repo.findById(id).get();
        repo.delete(obj);
    }

}
