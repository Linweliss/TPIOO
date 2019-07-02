package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.*;
import vistas.*;


public class Controlador implements ActionListener {

	private SistemaDeIndumentaria modelo;
	
	public Controlador(SistemaDeIndumentaria modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		if(evento.getActionCommand().equals("Clientes")) {
			VentanaClientes ventanaClientes = new VentanaClientes();
		}
		if(evento.getActionCommand().equals("Pedidos")) {
			VentanaPedidos ventanaPedidos = new VentanaPedidos();
		}
		if(evento.getActionCommand().equals("Productos")) {
			VentanaProductos ventanaProductos = new VentanaProductos();
		} 
		if(evento.getActionCommand().equals("Proveedores")) {
			VentanaProveedores ventanaProveedores = new VentanaProveedores();
		}
		if(evento.getActionCommand().equals("Vendedores")) {
			VentanaVendedores ventanaVendedores = new VentanaVendedores();
		}
		if(evento.getActionCommand().equals("Ventas")) {
			VentanaVentas ventanaVentas = VentanaVentas.getInstance();
			ventanaVentas.setVisible(true);
		}
		
		
		if(evento.getActionCommand().equals("Agregar venta")) {
			
			modelo.agregarVenta(new Vendedor("ddd", "dddd", "ddd", 0, "ddd"), new Cliente("dd", "ddd", "ddull", "ddd", "ddd"), null, 2);
			System.out.println(modelo.getVentas());
		}
	
		System.out.println(evento.getActionCommand());
	}

}
