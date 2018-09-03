/*
	Simulación de una computadora: CPU
	20-Agosto-2018
	Programa para simular el cpu de una computadora virtual
*/
import java.io.*;

public class cpu{
	static final int MUE_REG_REG = 0;
	static final int MUE_REG_BUS = 64;
	static final int MUE_BUS_REG = 1;
	static final int MUE_BUS_BUS = 65;
	static final int RA = 0;
	static final int RB = 1;
	static final int RC = 2;
	static final int IP = 3;
	static final int SP = 4;
	static final int HP = 5;
	static final int BP = 6;
	static final int IX = 7;
	static final int CS = 8;
	static final int SS = 9;
	static final int HS = 10;
	static final int DS = 11;
	static final int IPR = 12;
	static final int OI = 13;
	static final int ALU_B1 = 0;
	static final int ALU_B2 = 1;
	static final int ALU_B3 = 2;
	static final int MMU_B1 = 3;
	static final int MMU_B2 = 4;
	static final int MMU_B3 = 5;
	static final int MEM_B1 = 6;
	static final int MEM_B2 = 7;
	static final int ALU_SUM = 66;
	static final int ALU_RES = 67;
	static final int ALU_MUL = 68;
	static final int ALU_DIV = 69;






	
	//Registros del CPU
	public static int[] R = new int[14];
	//Buses de todo el sistema (compuertas)
	public static int[] B = new int[16];
	//PSW de la computadora (banderas)
	public static boolean[] PSW = new boolean[16];
	//Memoria principal RAM
	// int = 4 byte´s
	// 1Mb de RAM
	public static byte[] RAM = new byte[1048576]; 

	static int cod_inst = 0;
	static int orig = 0; 
	static int dest = 0;

	public static void capta(){ //Lee byte´s guardados en la memoria RAM

	}

	public static void traduce(){ //Traduce los bytés obtenidos
		
	}

	public static void ejecuta(){
		switch(cod_inst){
			case MUE_REG_REG:
				R[dest] = R[orig];
				break;
			case MUE_REG_BUS:
				if(dest == ALU_B3 || dest == MMU_B3 || dest == MEM_B2){
					System.out.println("\7Corto Circuito");
					System.exit(4);
				}
				B[dest] = R[orig];
				break;
			case MUE_BUS_REG:
				if(orig == MMU_B3){
					System.out.println("\7Corto Circuito");
					System.exit(4);
				}
				R[dest] = B[orig];
				break;
			case MUE_BUS_BUS:
				if(dest == ALU_B3 ||dest == MMU_B3 || dest== MEM_B2 ||orig == MMU_B2 || orig == MEM_B1){
					System.out.println("\7Corto Circuito");
					System.exit(4);
				}
				B[dest] = B[orig];
				break;
			case ALU_SUM:
				res_alu = 
				break;
			case ALU_RES:
				break;
			case ALU_DIV:
				break;
			case ALU_MUL:
				break;
		}
	}

	public static void main(String[] argumento) {
		R[RA] = 37;
		R[IX] = 0;
		cod_inst = MUE_REG_REG;
		orig = RA;
		dest = IX;
		ejecuta();
		System.out.println("REG A: "+R[RA]+", REG IX: "+R[IX]);
	}
}