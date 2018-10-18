//Importa el paquete que contiene la clase Scanner
import java.util.*;

//Definicion de la clase
  public class TestAnimal {
      //Definicion del Metodo principal
  	    public static void main(String[] args) {
  	    	
  	   //Declaracion del objeto Animal
        Animal animal1 = new Animal();

        //Declaracion del objeto teclado de la calse Scanner
          Scanner teclado = new Scanner(System.in);

        //Pedir el nombre del animal
          System.out.print("Teclee el Nombre del Animal: ");

        //Leer y asignar el nombre del objeto animal1
          animal1.setNombre(teclado.nextLine());

        //Pedir la edad del animal
          System.out.print("Teclee la edad del anima: ");
          int edad = teclado.nextInt();

        //asignar edad al objeto animal1
          animal1.setEdad(edad);

        //Informar de los datos animal1
          animal1.nace();
          System.out.println("mi nombre es " + animal1.getNombre() + " y tengo " + animal1.getEdad() + " anios");
		}
	}
  
  
