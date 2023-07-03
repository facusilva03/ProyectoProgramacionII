package com.proyectorepositor;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.proyecto.models.Usuario;

import jakarta.transaction.Transactional;



@Repository
@Transactional
public class UsuariosDaoImp implements UsuariosDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Usuario> obtenerUsuarios() {
		
		String query="from Usuario";
		
		return entityManager.createQuery(query).getResultList();
		
		
		
		
	}

}
