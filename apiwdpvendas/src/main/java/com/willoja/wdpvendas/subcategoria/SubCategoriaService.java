package com.willoja.wdpvendas.subcategoria;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoriaService {

    @Autowired
    private SubCategoriaRepository repo;

    public List<SubCategoria> buscaTodos() {
        return repo.findAll();
    }

    public SubCategoria inserir(SubCategoria obj) {
        obj.setDataCriacao(new Date());
        SubCategoria objNovo = repo.saveAndFlush(obj);
        return objNovo;

    }

    public SubCategoria alterar(SubCategoria obj) {
        obj.setDataAtualizacao(new Date());
        return repo.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        SubCategoria obj = repo.findById(id).get();
        repo.delete(obj);
    }

}
