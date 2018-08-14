import java.io.*;
import java.util.Scanner;

public class manu{
	public static void main(String[] args){
		int opcion; //Opci�n del me� principal
		int opcionS;//Opci�n de los menus 1er nivel
		int opcionS2; //Opcion de los menus 2 nivel
        do {        //Ciclo para cargar el men� principal, hasta que se teclee 5
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

			opcion = teclado.nextInt(); //Se lee la opcion del men� principal
			if ((opcion != 1) && (opcion != 2) && (opcion != 3) && (opcion != 4) &&(opcion!=5)) {
				System.out.println('\7');
			} //Tocar campanita si se introuce una opci�n incorrecta

			switch(opcion){ //Switch para decidir lo que se har� dependiendo de la opcion elegida
				case 1:     //En caso de que sea la opcion 1, se cargar� el SUBMENU 1, con sus opciones
					do{
						System.out.println("\t");
						System.out.println("\t");
						System.out.println("             =================   SUB-MEN\u00da 1   ============== ");
						System.out.println("\t");
						System.out.println("                                 1.- Opcion A");
						System.out.println("                                 2.- Opcion B");
						System.out.println("                                 3.- Opcion C");
						System.out.println("                                 4.- Opcion D");
						System.out.println("                                 5.- Regresar al Menu principal.");
						System.out.print("              Elige una opcion: ");
						opcionS = teclado.nextInt();
						if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
							System.out.println('\7');
						}
						switch(opcionS){
							case 1:
							do{
								System.out.println("\t");
								System.out.println("\t");
								System.out.println("             =================   SUB-MEN\u00da  1.1  ============== ");
								System.out.println("\t");
								System.out.println("                                 1.- Opcion 1");
								System.out.println("                                 2.- Opcion 2");
								System.out.println("                                 3.- Opcion 3");
								System.out.println("                                 4.- Opcion 4");
								System.out.println("                                 5.- Regresar al Menu anterior.");
								System.out.print("              Elige una opcion: ");
								opcionS2 = teclado.nextInt();
								if ((opcionS2 != 1) && (opcionS2 != 2) && (opcionS2 != 3) && (opcionS2 != 4) && (opcionS2 != 5)) {
									System.out.println('\7');
								}
							}while(opcionS2 != 5);
							break;
							case 2:
							do{
								System.out.println("\t");
								System.out.println("\t");
								System.out.println("             =================   SUB-MEN\u00da 1.2   ============== ");
								System.out.println("\t");
								System.out.println("                                 1.- Opcion 1");
								System.out.println("                                 2.- Opcion 2");
								System.out.println("                                 3.- Opcion 3");
								System.out.println("                                 4.- Opcion 4");
								System.out.println("                                 5.- Regresar al Menu anterior.");
								System.out.print("              Elige una opcion: ");
								opcionS2 = teclado.nextInt();
								if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
									System.out.println('\7');
								}
							}while(opcionS2 != 5);
							break;
							case 3:
							do{
								System.out.println("\t");
								System.out.println("\t");
								System.out.println("             =================   SUB-MEN\u00da 1.3   ============== ");
								System.out.println("\t");
								System.out.println("                                 1.- Opcion 1");
								System.out.println("                                 2.- Opcion 2");
								System.out.println("                                 3.- Opcion 3");
								System.out.println("                                 4.- Opcion 4");
								System.out.println("                                 5.- Regresar al Menu anterior.");
								System.out.print("              Elige una opcion: ");
								opcionS2 = teclado.nextInt();
								if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
									System.out.println('\7');
								}
							}while(opcionS2 != 5);
							break;
							case 4:
							do{
								System.out.println("\t");
								System.out.println("\t");
								System.out.println("             =================   SUB-MEN\u00da 1.4   ============== ");
								System.out.println("\t");
								System.out.println("                                 1.- Opcion 1");
								System.out.println("                                 2.- Opcion 2");
								System.out.println("                                 3.- Opcion 3");
								System.out.println("                                 4.- Opcion 4");
								System.out.println("                                 5.- Regresar al Menu anterior.");
								System.out.print("              Elige una opcion: ");
								opcionS2 = teclado.nextInt();
								if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
									System.out.println('\7');
								}
							}while(opcionS2 != 5);
							break;
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
					System.out.println("                                 1.- Opcion A");
					System.out.println("                                 2.- Opcion B");
					System.out.println("                                 3.- Opcion C");
					System.out.println("                                 4.- Opcion D");
					System.out.println("                                 5.- Regresar al Menu principal.");
					System.out.print("              Elige una opcion: ");
					opcionS = teclado.nextInt();
					if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
						System.out.println('\7');
					}
					switch(opcionS){
						case 1:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da  2.1  ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS2 != 1) && (opcionS2 != 2) && (opcionS2 != 3) && (opcionS2 != 4) && (opcionS2 != 5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
						case 2:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da 2.2   ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
						case 3:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da 2.3   ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
						case 4:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da 2.4   ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
				}
					//Aqui va el SWITCH!!!!
				}while(opcionS!=5);
				break;
				case 3:
				do{
					System.out.println("\t");
					System.out.println("\t");
					System.out.println("             =================   SUB-MEN\u00da 3   ============== ");
					System.out.println("\t");
					System.out.println("                                 1.- Opcion A");
					System.out.println("                                 2.- Opcion B");
					System.out.println("                                 3.- Opcion C");
					System.out.println("                                 4.- Opcion D");
					System.out.println("                                 5.- Regresar al Menu principal.");
					System.out.print("              Elige una opcion: ");
					opcionS = teclado.nextInt();
					if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
						System.out.println('\7');
					}
					switch(opcionS){
						case 1:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da  3.1  ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS2 != 1) && (opcionS2 != 2) && (opcionS2 != 3) && (opcionS2 != 4) && (opcionS2 != 5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
						case 2:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da 3.2   ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
						case 3:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da 3.3   ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
						case 4:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da 3.4   ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
				}
					//Aqui va el SWITCH!!!!
				}while(opcionS!=5);
				break;
				case 4:
				do{
					System.out.println("\t");
					System.out.println("\t");
					System.out.println("             =================   SUB-MEN\u00da 4   ============== ");
					System.out.println("\t");
					System.out.println("                                 1.- Opcion A");
					System.out.println("                                 2.- Opcion B");
					System.out.println("                                 3.- Opcion C");
					System.out.println("                                 4.- Opcion D");
					System.out.println("                                 5.- Regresar al Menu principal.");
					System.out.print("              Elige una opcion: ");
					opcionS = teclado.nextInt();
					if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
						System.out.println('\7');
					}
					switch(opcionS){
						case 1:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da  4.1  ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS2 != 1) && (opcionS2 != 2) && (opcionS2 != 3) && (opcionS2 != 4) && (opcionS2 != 5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
						case 2:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da 4.2   ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
						case 3:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da 4.3   ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
						case 4:
						do{
							System.out.println("\t");
							System.out.println("\t");
							System.out.println("             =================   SUB-MEN\u00da 4.4   ============== ");
							System.out.println("\t");
							System.out.println("                                 1.- Opcion 1");
							System.out.println("                                 2.- Opcion 2");
							System.out.println("                                 3.- Opcion 3");
							System.out.println("                                 4.- Opcion 4");
							System.out.println("                                 5.- Regresar al Menu anterior.");
							System.out.print("              Elige una opcion: ");
							opcionS2 = teclado.nextInt();
							if ((opcionS != 1) && (opcionS != 2) && (opcionS != 3) && (opcionS != 4) && (opcionS!=5)) {
								System.out.println('\7');
							}
						}while(opcionS2 != 5);
						break;
				}
					//Aqui va el SWITCH!!!!
				}while(opcionS!=5);
				break;
			}
        }while(opcion!=5);
        System.out.println("\t");
        System.out.println("                                      Adios!");
      }
}
