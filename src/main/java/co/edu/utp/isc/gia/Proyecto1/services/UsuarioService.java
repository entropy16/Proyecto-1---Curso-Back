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
            Usuario lastUser = listaUsuarios.get(listaUsuarios.size() - 1);
            int lastId = lastUser.getId();
            usuario.setId(lastId + 1);
            listaUsuarios.add(usuario);
        }
        return usuario;
    }

    public List<Usuario> obtenerLista() {
        
        return this.listaUsuarios;
    }

    public Usuario obtenerUsuario(int id) {
        for (Usuario user:listaUsuarios) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public void borrarUsuario(int id) {
        for (Usuario user:listaUsuarios) {
            if (user.getId() == id) {
                listaUsuarios.remove(user);
            }
        }
    }

    public void actualizarUsuario(int id, Usuario usuario) {
        for (Usuario user:listaUsuarios) {
            if (user.getId() == id) {
                listaUsuarios.remove(user);
                usuario.setId(id);
                listaUsuarios.add(usuario);
            }
        }
    }
}
