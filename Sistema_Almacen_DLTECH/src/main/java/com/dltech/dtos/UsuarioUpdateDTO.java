package com.dltech.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioUpdateDTO {
    private long idUsuario;

    private String nomApe;

    private String usuario;

    private String clave;

    private String bContraseña;
}
