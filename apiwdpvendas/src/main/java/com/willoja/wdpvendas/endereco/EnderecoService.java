package com.willoja.wdpvendas.endereco;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

    public Endereco buscarPorId(Long id) {
        return enderecoRepository.findById(id).get();
    }

    public Endereco inserir(Endereco objeto) {
        objeto.setDataCriacao(new Date());
        Endereco objetoNovo = enderecoRepository.saveAndFlush(objeto);
        return objetoNovo;
    }

    public Endereco alterar(Endereco objeto) {
        objeto.setDataAtualizacao(new Date());
        return enderecoRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id) {
        Endereco objeto = enderecoRepository.findById(id).get();
        enderecoRepository.delete(objeto);
    }
}

