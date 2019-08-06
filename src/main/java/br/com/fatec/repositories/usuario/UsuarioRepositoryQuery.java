package br.com.fatec.repositories.usuario;

import java.util.Optional;

import br.com.fatec.model.Usuario;

public interface UsuarioRepositoryQuery {
	public Optional<Usuario> findByUsername(String username);
}
