package com.willoja.wdpvendas.produtoImagem;

import java.util.Date;

import com.willoja.wdpvendas.produto.Produto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "produto_imagens")
@Data
public class ProdutoImagens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "idProduto")
    private Produto produto;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
    
    @Transient
    private byte[] arquivo;
}

