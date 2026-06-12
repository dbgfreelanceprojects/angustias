package es.dbgfreelance.angustias.service;

import java.util.List;

import es.dbgfreelance.angustias.modelo.Usuario;
import es.dbgfreelance.angustias.repository.UsuarioRepository;

public class UsuarioService {
  private final UsuarioRepository usuarioRepository;

  public UsuarioService(UsuarioRepository usuarioRepository) {
    this.usuarioRepository = usuarioRepository;
  }

  public Usuario guardarUsuario(Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  public List<Usuario> obtenerUsuarios() {
    return usuarioRepository.findAll();
  }

}
