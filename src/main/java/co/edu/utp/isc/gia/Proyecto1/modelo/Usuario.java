package co.edu.utp.isc.gia.Proyecto1.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable{

    private int id;
    private String nombre;
    private String apellido;
}
