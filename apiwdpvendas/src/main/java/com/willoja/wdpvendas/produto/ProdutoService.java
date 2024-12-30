package com.willoja.wdpvendas.produto;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repo;

    public List<Produto> buscaTodos() {
        return repo.findAll();
    }

    public Produto buscarPorId(Long id) {
        Optional<Produto> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public Produto inserir(Produto obj) {
        obj.setDataCriacao(new Date());
        obj.setDataAtualizacao(new Date());
        Produto objNovo = repo.saveAndFlush(obj);
        return objNovo;

    }

    public Produto alterar(Produto obj) {
        obj.setDataAtualizacao(new Date());
        return repo.saveAndFlush(obj);

    }

    public void excluir(Long id) {
        Produto obj = repo.findById(id).get();
        repo.delete(obj);
    }

}

