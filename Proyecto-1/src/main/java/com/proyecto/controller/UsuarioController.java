package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.models.Usuario;
import com.proyectorepositor.UsuariosDao;

@RestController
public class UsuarioController {
	
	@Autowired
  
     @RequestMapping(value="mensaje")
	    public String mensaje(){ 
	    return "Hola mundo";
	 }
       
     @RequestMapping(value="persona")
       public List<String>listarPersonas(){
    	   
    	 return List.of("Facundo","Fabian","Franco");  
    	    
       }
       
     @RequestMapping(value="usuario/{id}")
     public Usuario getUsuario(@PathVariable Long id) {
    	 
    	 Usuario usuario=new Usuario();
    	 usuario.setId(id);
    	 usuario.setNombre("Facundo");
    	 usuario.setApellido("Silva");
    	 usuario.setEmail("facusilva2003@gmail.com");
    	 usuario.setTelefono("2616152411");
    	 
    	 return usuario;
    	 
     }
     
     @RequestMapping(value="usuario/lista_user")
     public List<Usuario> listar_variosUsuarios() {
    	 
    	 List<Usuario> usuarios=new ArrayList<>();
    	 
    	 Usuario usuario1=new Usuario();
    	 usuario1.setId(4A);
    	 usuario1.setNombre("Facundo");
    	 usuario1.setApellido("Silva");
    	 usuario1.setEmail("facusilva2003@gmail.com");
    	 usuario1.setTelefono("2616152411");
    	 
    	 Usuario usuario2=new Usuario();
    	 usuario2.setId(5F);
    	 usuario2.setNombre("Fabian");
    	 usuario2.setApellido("Silva");
    	 usuario2.setEmail("facusilva@gmail.com");
    	 usuario2.setTelefono("2615507788");
    	 
    	 usuarios.add(usuario1);
    	 usuarios.add(usuario2);
    	 

    	 return usuarios;
    	 
     }
     
     @RequestMapping(value="api/usuarios")

     public List<Usuarios> getUsuarios(){
    	 List<usuarios> user=UsuariosDao.obtenerUsuarios();
    	 
    	 return user;
     }
    
}
