package Planta;
import java.util.Scanner;


public class menuPrincipal {
	
    static int OpcionUsuario = -1;                                     
    static Scanner scanner = new Scanner(System.in);    
    
    public static void main(String[] args) {
    	
        while (OpcionUsuario != 0)
        {
            try{
                System.out.println("***   PLANTA DE PRODUCCION ***\n");
                System.out.println("     .:: MENU PRINCIPAL ::.   \n");
                System.out.println("1. Operativos.                      ");
                System.out.println("2. Administrativos.              ");            
                System.out.println("3. Tecnicos.                     ");
                System.out.println("4. No Tecnicos.                      ");
                System.out.println("0. Salir                      \n");
                System.out.print("Señor usuario, elige opción: _    ");
                OpcionUsuario = Integer.parseInt(scanner.nextLine()); 
                
                switch(OpcionUsuario)
                {
                    case 1: 
                    	System.out.println("Has seleccionado operativos");
                        break;
                    case 2: 
                    	System.out.println("Has seleccionado Administrativos");
                        break;
                    case 3: 
                    	System.out.println("Has seleccionado Tecnicos");
                        break;
                    case 4: 
                    	System.out.println("Has seleccionado No Tecnicos");
                        break;
                    case 0: 
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Opción no reconocida");break;
                }
                System.out.println("\n"); 
            }
            catch(Exception e){
                System.out.println("Uoop! Error!");
            }
        }
    }    
} 
 