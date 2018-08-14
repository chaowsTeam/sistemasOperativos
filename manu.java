import java.io.*;
import java.util.Scanner;

public class manu{
	public static void main(String[] args){
		int opcion; //Opción del meú principal
		int opcionS;//Opción de los menús secundarios
        do {        //Ciclo para cargar el menú principal, hasta que se teclee 5 
			Scanner teclado = new Scanner(System.in);
			System.out.println("\t");
			System.out.println("             ================= MEN\u00da PRINCIPAL ==============");
			System.out.println("\t");
			System.out.println("                                 1.- Opcion 1");
			System.out.println("                                 2.- Opcion 2");
			System.out.println("                                 3.- Opcion 3");
			System.out.println("                                 4.- Opcion 4");
			System.out.println("                                 5.- Salir.");
			System.out.print("               Elige una opcion: ");

			opcion = teclado.nextInt(); //Se lee la opcion del menú principal
			if ((opcion != 1) && (opcion != 2) && (opcion != 3) && (opcion != 4) &&(opcion!=5)) {
				System.out.println('\7');
			} //Tocar campanita si se introuce una opción incorrecta

			switch(opcion){ //Switch para decidir lo que se hará dependiendo de la opcion elegida
				case 1:     //En caso de que sea la opcion 1, se cargará el SUBMENU 1, con sus opciones
					do{
						System.out.println("\t");
						System.out.println("\t");
						System.out.println("             =================   SUB-MEN\u00da 1   ============== ");
						System.out.println("\t");
						System.out.println("                                 1.- Opcion 1");
						System.out.println("                                 2.- Opcion 2");
						System.out.println("                                 3.- Opcion 3");
						System.out.println("                                 4.- Opcion 4");
						System.out.println("                                 5.- Regresar al Menu principal.");
						System.out.print("              Elige una opcion: ");
						opcionS = teclado.nextInt();
						if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
							System.out.println('\7');
						}
						//Aqui va el SWITCH!!!!
					}while(opcionS!=5);				
					break;
				case 2:
					do{
						System.out.println("\t");
						System.out.println("\t");
						System.out.println("             =================   SUB-MEN\u00da 2   ============== ");
						System.out.println("\t");
						System.out.println("                                 1.- Opcion 1");
						System.out.println("                                 2.- Opcion 2");
						System.out.println("                                 3.- Opcion 3");
						System.out.println("                                 4.- Opcion 4");
						System.out.println("                                 5.- Regresar al Menu principal.");
						System.out.print("              Elige una opcion: ");
						opcionS = teclado.nextInt();
						if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) &&(opcionS!=5)) {
							System.out.println('\7');
						}
					}while(opcionS!=5);
					break;
				case 3:
					do{
						System.out.println("\t");
						System.out.println("\t");
						System.out.println("             =================   SUB-MEN\u00da 3   ============== ");
						System.out.println("\t");
						System.out.println("                                 1.- Opcion 1");
						System.out.println("                                 2.- Opcion 2");
						System.out.println("                                 3.- Opcion 3");
						System.out.println("                                 4.- Opcion 4");
						System.out.println("                                 5.- Regresar al Menu principal.");
						System.out.print("              Elige una opcion: ");
						opcionS = teclado.nextInt();
						if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) &&(opcionS!=5)) {
							System.out.println('\7');
						}
					}while(opcionS!=5);
					break;
				case 4:
					do{
						System.out.println("\t");
						System.out.println("\t");
						System.out.println("             =================   SUB-MEN\u00da 4   ============== ");
						System.out.println("\t");
						System.out.println("                                 1.- Opcion 1");
						System.out.println("                                 2.- Opcion 2");
						System.out.println("                                 3.- Opcion 3");
						System.out.println("                                 4.- Opcion 4");
						System.out.println("                                 5.- Regresar al Menu principal.");
						System.out.print("              Elige una opcion: ");
						opcionS = teclado.nextInt();
						if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) &&(opcionS!=5)) {
							System.out.println('\7');
						}
					}while(opcionS!=5);
					break;	
			}
        }while(opcion!=5); 
        System.out.println("\t");
        System.out.println("                                      Adios!");
      }   
}