package Planta;

public class Administrativo extends Empleado {
	String TituProfe;
	String AñosExp;
	int NumPer;
	String NumExtencion;
	
	public void SoyUnInforme () {
		System.out.println ("Pero que.... es un informe de cuantas horas duerme");
	}
	public void ConsulTituProfe() {
		System.out.println ("Cursos realizados: " + TituProfe);
	}
	public void ConsulDescri() {
		this.Consultar();
	}
	public void ActualizarTituProfe () {
		System.out.println ("Cursos realizados: " + TituProfe);
		TituProfe=scanner.nextLine();
	}
	public void ActualizarDescri () {
		this.ActualizarDatos();
	}
}
