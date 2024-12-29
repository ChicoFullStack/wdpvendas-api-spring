package com.willoja.wdpvendas.produtoImagem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens, Long>{
    
    public List<ProdutoImagens> findByProdutoId(Long id);
}
