package com.proyectorepositor;

import java.util.List;

import com.proyecto.models.Usuario;

@Transactional
public interface UsuariosDao {

	List<Usuario> obtenerUsuarios();
	
	
}
