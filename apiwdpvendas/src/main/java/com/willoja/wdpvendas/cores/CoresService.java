package com.willoja.wdpvendas.cores;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoresService {

    @Autowired
    private CoresRepository repo;

    public List<Cores> buscaTodos() {
        return repo.findAll();
    }

    public Cores inserir(Cores obj) {
        obj.setDataCriacao(new Date());
        Cores objNovo = repo.saveAndFlush(obj);
        return objNovo;

    }

    public Cores alterar(Cores obj) {
        obj.setDataAtualizacao(new Date());
        return repo.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Cores obj = repo.findById(id).get();
        repo.delete(obj);
    }

}


