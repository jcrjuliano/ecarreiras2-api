package br.com.fatec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatec.model.Usuario;
import br.com.fatec.repositories.usuario.UsuarioRepositoryQuery;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>, UsuarioRepositoryQuery {

}
