package com.willoja.wdpvendas.subcategoria;

import java.util.Date;

import com.willoja.wdpvendas.categoria.Categoria;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "sub_categoria")
@Data
public class SubCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

}

