package com.willoja.wdpvendas.marca;

import java.util.Date;

import com.willoja.wdpvendas.categoria.Categoria;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "marca")
@Data
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;

    @Lob
    @Column(name = "logo", columnDefinition = "BLOB")
    private byte[] logo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

}

