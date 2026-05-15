package es.dbgfreelance.angustias.controller;

import java.util.List;

import es.dbgfreelance.angustias.modelo.Usuario;

public interface UsuarioController {

    List<Usuario> getAllUsuarios();

    Usuario createUsuario(Usuario usuario);

}