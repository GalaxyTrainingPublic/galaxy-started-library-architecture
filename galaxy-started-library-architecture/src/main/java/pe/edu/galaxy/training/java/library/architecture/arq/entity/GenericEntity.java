package pe.edu.galaxy.training.java.library.architecture.arq.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class GenericEntity {

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    @Column(name = "usuario_registro")
    private Long usuarioRegistro;

    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    @Column(name = "usuario_actualizacion")
    private Long usuarioActualizacion;

    @Column(name = "estado")
    private String  estado;

    @Column(name = "sw_migrado")
    private Boolean  isMigrado=false;

    @PrePersist
    void persist(){
        fechaRegistro= LocalDateTime.now();
    }

    @PreUpdate
    void udpate(){
        fechaActualizacion= LocalDateTime.now();
    }

}
