package app;

import java.util.*;
import herency.*;
import objetos.*;

public class M3App {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Vehicle> arrayVehicle = new ArrayList();
	static ArrayList<Persona> arrayPersonas = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	
	public static void menu() {
		//menu que acaba al introducir 0
		int num;
		do {
			System.out.println("----------MENU----------");
			System.out.println("1-Introducir un usuario");
			num = sc.nextInt();
		} while (num!=0);
	}
	
}