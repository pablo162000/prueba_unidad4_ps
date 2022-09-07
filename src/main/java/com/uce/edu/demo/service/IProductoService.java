package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Producto;
import com.uce.edu.demo.repository.modelo.ProductoSencillo;

public interface IProductoService {

	
	public void insertar(Producto producto);
	
//	public void actualizar(Producto producto);
//	
	public Producto buscar(String codigoBarras);
//	
	
	public ProductoSencillo buscarPorCodigodeBarrasStock(String codigoBarras);

	
	public Producto buscarPorId(Integer id);
	public List<Producto> buscarTodos();


	
}
