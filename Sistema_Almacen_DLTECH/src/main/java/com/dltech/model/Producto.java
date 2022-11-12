package com.dltech.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tb_producto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @Column(length = 60, nullable = false)
    private String descripcion;

    @Column(length = 60, nullable = false)
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria idCategoria;

    @ManyToOne
    @JoinColumn(name = "idEstadoP")
    private EstadoProducto idEstadoP;

    @ManyToOne
    @JoinColumn(name = "idMarca")
    private Marca idMarca;
}
