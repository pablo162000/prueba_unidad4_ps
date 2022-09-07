package com.uce.edu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.repository.modelo.ProductoSeleccionado;
import com.uce.edu.demo.service.IVentaService;

@Controller
@RequestMapping("/ventas")
public class VentaController {
	
	
	@Autowired
	private IVentaService iVentaService;
	
	public String realizarVenta(List<ProductoSeleccionado> listaProductosSeleccionados, String cedula,
			String numeroVenta) {
		
		this.realizarVenta(listaProductosSeleccionados, cedula, numeroVenta);
		
		return "" ;
	}
	
	
	
	

}
