package es.dbgfreelance.angustias.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import es.dbgfreelance.angustias.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
