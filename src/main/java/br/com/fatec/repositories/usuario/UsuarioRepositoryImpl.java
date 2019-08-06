package br.com.fatec.repositories.usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.fatec.model.Usuario;
import br.com.fatec.model.Usuario_;

public class UsuarioRepositoryImpl implements UsuarioRepositoryQuery {

	@PersistenceContext 
	private EntityManager manager;
	
	@Override
	public Optional<Usuario> findByUsername(String username) {
		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		
		CriteriaQuery<Usuario> criteriaQuery = criteriaBuilder.createQuery(Usuario.class);
		
		Root<Usuario> root = criteriaQuery.from(Usuario.class);
		
		List<Predicate> predicates = new ArrayList<>();
		
		predicates.add(criteriaBuilder.equal(criteriaBuilder.lower(root.get(Usuario_.username)), username.toLowerCase()));
		predicates.add(criteriaBuilder.isTrue(root.get(Usuario_.active)));
		
		criteriaQuery.where(predicates.toArray(new Predicate[predicates.size()]));
		
		TypedQuery<Usuario> query = manager.createQuery(criteriaQuery);
		
		Optional<Usuario> usuarios = query.getResultList().stream().findFirst();
		
		return usuarios;
		
	}
	
}
