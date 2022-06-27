package com.idat.brig.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.brig.modelo.Usuario;



@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
	Usuario findByUsuario(String usuario);

}
