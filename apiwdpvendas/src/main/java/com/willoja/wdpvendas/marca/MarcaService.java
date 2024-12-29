package com.willoja.wdpvendas.marca;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository repo;

    public List<Marca> buscaTodos() {
        return repo.findAll();
    }

    public Marca inserir(Marca obj) {
        obj.setDataCriacao(new Date());
        Marca objNovo = repo.saveAndFlush(obj);
        return objNovo;

    }

    public Marca alterar(Marca obj) {
        obj.setDataAtualizacao(new Date());
        return repo.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Marca obj = repo.findById(id).get();
        repo.delete(obj);
    }

}

