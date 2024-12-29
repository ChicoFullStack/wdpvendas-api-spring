package com.willoja.wdpvendas.produto;

import java.util.Date;
import java.util.List;

import com.willoja.wdpvendas.marca.Marca;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "produto")
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String codigoSku;
    private String nome;
    private String descricao;
    private Double preco;
    private Double precoCusto;
    private Double precoPromocional;
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name="idMarca")
    private Marca marca;

    @ElementCollection
    @CollectionTable(name = "produto_categoria", joinColumns = @JoinColumn(name = "produto_id"))
    @Column(name = "categoria")
    private List<String> categoria;

    @ElementCollection
    @CollectionTable(name = "produto_subcategoria", joinColumns = @JoinColumn(name = "produto_id"))
    @Column(name = "subcategoria")
    private List<String> subcategoria;


    @ElementCollection
    @CollectionTable(name = "produto_cores", joinColumns = @JoinColumn(name = "produto_id"))
    @Column(name = "cor")
    private List<String> cores;

    @ElementCollection
    @CollectionTable(name = "produto_tamanhos", joinColumns = @JoinColumn(name = "produto_id"))
    @Column(name = "tamanho")
    private List<String> tamanhos;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

}

