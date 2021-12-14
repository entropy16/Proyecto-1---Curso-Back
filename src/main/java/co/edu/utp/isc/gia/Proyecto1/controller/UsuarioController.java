package co.edu.utp.isc.gia.Proyecto1.controller;

import co.edu.utp.isc.gia.Proyecto1.modelo.Usuario;
import co.edu.utp.isc.gia.Proyecto1.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("crear")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioService.crearUsuario(usuario);
    }

    @GetMapping("obtenerLista")
    public List<Usuario> obtenerLista(){
        return usuarioService.obtenerLista();
    }

    @GetMapping("obtenerUsuario")
    public Usuario obtenerUsuario(@RequestParam int id){
        return usuarioService.obtenerUsuario(id);
    }

    @PutMapping("actualizarUsuario/{id}")
    public void actualizarUsuario(@PathVariable("id") int id, @RequestBody Usuario usuario){
        usuarioService.actualizarUsuario(id, usuario);
    }

    @GetMapping("borrarUsuario")
    public void borrarUsuario(@RequestParam int id){
        usuarioService.borrarUsuario(id);
    }
}
