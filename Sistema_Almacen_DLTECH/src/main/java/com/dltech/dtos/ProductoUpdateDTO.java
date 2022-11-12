package com.dltech.dtos;

import com.dltech.model.Categoria;
import com.dltech.model.EstadoProducto;
import com.dltech.model.Marca;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoUpdateDTO {
    private Long idProducto;
    private String descripcion;
    private String modelo;
    private Categoria idCategoria;
    private EstadoProducto idEstadoP;
    private Marca idMarca;
}
