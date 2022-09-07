package com.uce.edu.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.repository.modelo.Producto;
import com.uce.edu.demo.repository.modelo.ProductoSencillo;
import com.uce.edu.demo.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private IProductoService iProductoService;

	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {

		List<Producto> lista = this.iProductoService.buscarTodos();
		modelo.addAttribute("productos", lista);
		return "vistaListaProductos";
	}
	
	@GetMapping("/buscarUno/{codigoBarras}")

	public String buscarPorCodigodeBarrasStock(@PathVariable("codigoBarras")String codigoBarras, Model modelo) {
		
		ProductoSencillo productosencillo = this.iProductoService.buscarPorCodigodeBarrasStock(codigoBarras);
		
		modelo.addAttribute("producto",productosencillo);
		
		
		return "vistaProducto";
	}

	

	
	@PostMapping("/ingresar")
	public String ingresarProducto(Producto producto) {
		
		this.iProductoService.insertar(producto);
		return "redirect:/productos/nuevoProducto";
	}
	
	@GetMapping("/nuevoProducto")
    public String paginaNuevoProducto(Producto producto) {
        return "vistaNuevoProducto";

    }
	
	

}
