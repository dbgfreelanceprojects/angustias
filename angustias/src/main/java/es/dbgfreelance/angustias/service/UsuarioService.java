package es.dbgfreelance.angustias.service;

import java.util.List;

import es.dbgfreelance.angustias.modelo.Usuario;
import es.dbgfreelance.angustias.repository.UsuarioRepository;

public class UsuarioService {
 private final UsuarioRepository usuarioRepository;
    public List<Usuario> getAllUsuarios() {
       
        return usuarioRepository.findAll();
    }

    public Usuario createUsuario(Usuario usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUsuario'");
    }

}
