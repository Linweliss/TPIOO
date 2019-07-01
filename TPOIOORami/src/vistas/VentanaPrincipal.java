package vistas;
import javax.swing.*;

import controlador.Controlador;
import modelo.SistemaDeIndumentaria;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame /*implements ActionListener*/{
	
	//TITULO
	private String titulo = "Ventana principal";
	
	//BOTONES
	private JButton btnVentas;
	private JButton btnPedidos;
	private JButton btnVendedores;
	private JButton btnClientes;
	private JButton btnProveedores;
	private JButton btnProductos;

	//LABELS
	private JLabel lblDescripcionVentana; 
	
	
	
	public VentanaPrincipal(){
		this.setVisible(true);
		this.setTitle(titulo);
		this.setSize(300,300);
		
		Container panel=this.getContentPane();
		//LABELS
		lblDescripcionVentana = new JLabel("Elija que ventana abrir:");
		
		//BOTONES
		btnClientes = new JButton("Ventana clientes");
		btnPedidos = new JButton("Ventana pedidos");
		btnProductos = new JButton("Ventana productos");
		btnProveedores = new JButton("Ventana proveedores");
		btnVendedores = new JButton("Ventana vendedores");
		btnVentas = new JButton("Ventana ventas");

	
		
		
		//lblDescripcionVentana.setAlignmentX(RIGHT_ALIGNMENT);
		panel.setLayout(new GridLayout(7,0,6,6));
		
		panel.add(lblDescripcionVentana);

		panel.add(btnClientes);
		panel.add(btnPedidos);
		panel.add(btnProductos);
		panel.add(btnProveedores);
		panel.add(btnVendedores);
		panel.add(btnVentas);


		Controlador controlador = new Controlador(SistemaDeIndumentaria.getInstance());
		btnClientes.addActionListener (controlador);
		btnPedidos.addActionListener (controlador);
		btnProductos.addActionListener(controlador);
		btnProveedores.addActionListener(controlador);
		btnVendedores.addActionListener (controlador);
		btnVentas.addActionListener (controlador);


		
		setDefaultCloseOperation (EXIT_ON_CLOSE);
	}




/*
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	*/
}
