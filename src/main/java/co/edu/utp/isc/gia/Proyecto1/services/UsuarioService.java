package co.edu.utp.isc.gia.Proyecto1.services;

import co.edu.utp.isc.gia.Proyecto1.modelo.Usuario;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioService {

    private List<Usuario> listaUsuarios = new ArrayList();

    public Usuario crearUsuario(Usuario usuario){
        if(listaUsuarios.isEmpty()){
            usuario.setId(1);
            listaUsuarios.add(usuario);
        } else {
            usuario.setId(listaUsuarios.size());
            listaUsuarios.add(usuario);
        }
        return usuario;
    }

    public List<Usuario> obtenerLista() {
        return this.listaUsuarios;
    }
}
