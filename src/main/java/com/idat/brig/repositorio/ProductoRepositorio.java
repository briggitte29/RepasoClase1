package com.idat.brig.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.brig.modelo.Productos;



@Repository
public interface ProductoRepositorio extends JpaRepository< Productos, Integer>{


}
