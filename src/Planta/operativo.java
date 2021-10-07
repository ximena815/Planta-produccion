package Planta;

public class operativo extends Empleado  {
	
	String cursosRea;
	String UbiTraba;
	String OfiReali;
	String DesLabor;
	public void OperatiDatos () {
		System.out.println ("Llena tus datos ;3 ");
		System.out.println ("Cursos realizados: " + cursosRea);
		cursosRea=scanner.nextLine();
		System.out.println ("Ubicacion de trabajo: " + UbiTraba);
		UbiTraba=scanner.nextLine();
		System.out.println ("Oficio que realiza: " + OfiReali);
		OfiReali=scanner.nextLine();
		System.out.println ("Descripción de labores: " + DesLabor);
		DesLabor=scanner.nextLine();
	}
	public void ConsulCursos() {
		System.out.println ("Cursos realizados: " + cursosRea);
	}
	public void ConsulDescri() {
		System.out.println ("Descripción de labores: " + DesLabor);
	}
	public void ActualizarCursos () {
		System.out.println ("Cursos realizados: " + cursosRea);
		cursosRea=scanner.nextLine();
	}
	public void ActualizarDescri () {
		System.out.println ("Descripción de labores: " + DesLabor);
		DesLabor=scanner.nextLine();
	}

}
