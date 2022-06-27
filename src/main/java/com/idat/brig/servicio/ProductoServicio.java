package com.idat.brig.servicio;

import java.util.List;

import com.idat.brig.dto.ProductoDTORequest;
import com.idat.brig.dto.ProductoDTOResponse;


public interface ProductoServicio {

	
	public void guardarProducto(ProductoDTORequest producto);
	public void editarProducto(ProductoDTORequest producto);
	
	public void eliminarProducto(Integer id);
	
	public List<ProductoDTOResponse> listarProductos();
	public ProductoDTOResponse obtenerProductoId(Integer id);
}
