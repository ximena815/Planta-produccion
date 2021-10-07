package Planta;

import java.util.Scanner;

public class Empleado {
	
	protected int celular;
	protected int cedula;
	protected String nombre;
	protected String email;
	protected String direccion;
	protected String FecIngre;
	protected String FecCumple;
	static Scanner scanner = new Scanner(System.in); 

	public void Datos () {
		celular=666;
		cedula=999;
		nombre="Raton";
		email="Raton_Perez@diente.com.co";
		direccion="Limbo";
		FecIngre="11/02/1002";
		FecCumple="24/12/1439";
	}
	public void Consultar () {
		System.out.println ("Mira tus datos");
		System.out.println ("Nombre: " + nombre);
		System.out.println ("Cedula: " + cedula);
		System.out.println ("Celular: " + celular);
		System.out.println ("Correo electronico " + email);
		System.out.println ("Direccion: " + direccion);
		System.out.println ("Fecha de ingreso: " + FecIngre);
		System.out.println ("Fecha de cumpleaños: " + FecCumple);
	}
	public void ActualizarDatos () {
		System.out.println ("Llena tus datos ;3 ");
		System.out.println ("Nombre: " + nombre);
		nombre=scanner.nextLine();
		System.out.println ("Cedula: " + cedula);
		cedula=Integer.parseInt(scanner.nextLine());
		System.out.println ("Celular: " + celular);
		celular=Integer.parseInt(scanner.nextLine());
		System.out.println ("Correo electronico " + email);
		email=scanner.nextLine();
		System.out.println ("Direccion: " + direccion);
		direccion=scanner.nextLine();
		System.out.println ("Fecha de ingreso: " + FecIngre);
		FecIngre=scanner.nextLine();
		System.out.println ("Fecha de cumpleaños: " + FecCumple);
		FecCumple=scanner.nextLine();
	}
	public void LiquidacionDeNomina () {
		System.out.println ("No se que es liquidacion de Nomina pero aca la puedes mirar ");
	}
	public void LiquidacionDeVacaciones () {
		System.out.println ("Aca puedes mirar las vacaciones pero no tienes");
	}
	
}
