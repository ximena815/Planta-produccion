package Planta;

public class Tecnico extends operativo 
{
	
	public Tecnico() {
		super ();
	}

	public void Info() {
		operativo OPE = new operativo();
		OPE.DesLabor= "Hola";
		OPE.UbiTraba= "Hola";
		OPE.OfiReali= "Hola";
	}
}
