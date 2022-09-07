package com.uce.edu.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.Producto;
import com.uce.edu.demo.repository.modelo.ProductoSencillo;

public interface IProductoRepository {

	public void insertar(Producto producto);
	
	
	public Producto buscar(String codigoBarras);
	
	public Producto buscarPorId(Integer id);
	
	public void actualizar(Producto producto);
	
	
	
	public Producto buscarPorCodigodeBarrasStock(String codigoBarras);
	
	public List<Producto> buscarTodos();
}
