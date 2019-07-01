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
		
		if(evento.getActionCommand().equals("Ventana clientes")) {
			VentanaClientes ventanaClientes = new VentanaClientes();
		}
		if(evento.getActionCommand().equals("Ventana pedidos")) {
			VentanaPedidos ventanaPedidos = new VentanaPedidos();
		}
		if(evento.getActionCommand().equals("Ventana productos")) {
			VentanaProductos ventanaProductos = new VentanaProductos();
		} 
		if(evento.getActionCommand().equals("Ventana proveedores")) {
			VentanaProveedores ventanaProveedores = new VentanaProveedores();
		}
		if(evento.getActionCommand().equals("Ventana vendedores")) {
			VentanaVendedores ventanaVendedores = new VentanaVendedores();
		}
		if(evento.getActionCommand().equals("Ventana ventas")) {
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
