package com.dltech.dtos;

import com.dltech.model.Distrito;
import com.dltech.model.TipoDocumentoIdentidad;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class ClienteDTO {

    private Long idCliente;
    private String nomApe;
    @ManyToOne
    @JoinColumn(name = "idTipoDocumentoIdentidad")
    private TipoDocumentoIdentidad tipoDocumentoIdentidad;
    private String docIdent;
    private String ruc;
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "idDistrito")
    private Distrito distrito;
    private String telefono;
    private String celular;
    private String correo;
}
