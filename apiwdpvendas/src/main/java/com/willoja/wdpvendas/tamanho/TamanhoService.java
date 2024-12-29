package com.willoja.wdpvendas.tamanho;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TamanhoService {

    @Autowired
    private TamanhoRepository repo;

    public List<Tamanho> buscaTodos() {
        return repo.findAll();
    }

    public Tamanho inserir(Tamanho obj) {
        obj.setDataCriacao(new Date());
        Tamanho objNovo = repo.saveAndFlush(obj);
        return objNovo;

    }

    public Tamanho alterar(Tamanho obj) {
        obj.setDataAtualizacao(new Date());
        return repo.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Tamanho obj = repo.findById(id).get();
        repo.delete(obj);
    }

}

