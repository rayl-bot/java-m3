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
		// menu que acaba al introducir 0
		int num;
		do {
			System.out.println("----------MENU----------");
			System.out.println("1-Introducir un usuario");
			System.out.println("2-Introducir un vehiculo");
			System.out.println("0-Salir");
			num = sc.nextInt();// variable con la que nos moveremos de menus

			if (num == 2)
				menuVehicle();// llama al menu de vehiculo
			else if (num == 1)
				menuPersona();// llama al menu de persona

		} while (num != 0);
		System.out.println("Programa finalizado");
	}

	public static void menuVehicle() {
		int num;
		do {// menu para mostrar las diferentes opciones de persona
			System.out.println("----------MENU VEHICULOS----------");
			System.out.println("1-Introducir un coche");
			System.out.println("2-Introducir una moto");
			System.out.println("3-Introducir un camion");
			System.out.println("4-Mostrar vehiculos");
			System.out.println("0-Cerrar");
			num = sc.nextInt();
			if (num == 1)
				inCoche();
			else if (num == 2)
				inBike();
			else if (num == 3)
				inCamion();
			else if(num == 4)
				showVehicles();
		} while (num != 0);
	}
	
	public static void inCoche() {
		System.out.println("Introduce el numero de coches que quieras añadir:");
		int num = sc.nextInt();
		// bucle que se repetira tantas veces como el numero indicado por parametro
		// anteriormente
		for (int i = 0; i < num; i++) {
			//atributos de vehicles
			System.out.println("Marca: ");
			String marca = sc.next();
			System.out.println("Color: ");
			String color = sc.next();
			System.out.println("Matricula: ");
			String matricula = sc.next();
			//atributos de coche
			System.out.println("Ruedas delanteras: ");
			System.out.println("Marca: ");
			String marcar = sc.next();
			System.out.println("Diametro: ");
			Double diametro = sc.nextDouble();
			System.out.println("Ruedas traseras: ");
			System.out.println("Marca: ");
			String marcar2 = sc.next();
			System.out.println("Diametro: ");
			Double diametro2 = sc.nextDouble();
			System.out.println("Seleccione un titular: ");
			showTitular();
			int numTitular = sc.nextInt();
			System.out.println("Quieres que tenga un conductor? Si/No");
			String eleccion = sc.next();
			if(eleccion.equalsIgnoreCase("si")) {
				showConductor();
				System.out.println("Selecciona uno de los anteriores conductores: ");
				int numConductor = sc.nextInt();
				Coche coche = new Coche(marca,color,matricula, new Rueda(marcar,diametro), new Rueda(marcar2, diametro2));
				coche.addPersona(arrayPersonas.get(numTitular));
				coche.addPersona(arrayPersonas.get(numConductor));
				arrayVehicle.add(coche);
			}else
				arrayVehicle.add(new Coche(marca,color,matricula, new Rueda(marcar,diametro), new Rueda(marcar2, diametro2)));
		}
	}
	
	public static void inBike() {
		System.out.println("Introduce el numero de motos que quieras añadir:");
		int num = sc.nextInt();
		// bucle que se repetira tantas veces como el numero indicado por parametro
		// anteriormente
		for (int i = 0; i < num; i++) {
			//atributos de vehicles
			System.out.println("Marca: ");
			String marca = sc.next();
			System.out.println("Color: ");
			String color = sc.next();
			System.out.println("Matricula: ");
			String matricula = sc.next();
			//atributos de coche
			System.out.println("Rueda delantera: ");
			System.out.println("Marca: ");
			String marcar = sc.next();
			System.out.println("Diametro: ");
			Double diametro = sc.nextDouble();
			System.out.println("Rueda trasera: ");
			System.out.println("Marca: ");
			String marcar2 = sc.next();
			System.out.println("Diametro: ");
			Double diametro2 = sc.nextDouble();
			arrayVehicle.add(new Bike(marca,color,matricula, new Rueda(marcar,diametro), new Rueda(marcar2, diametro2)));
		}
	}
	
	public static void inCamion() {
		System.out.println("Introduce el numero de camiones que quieras añadir:");
		int num = sc.nextInt();
		// bucle que se repetira tantas veces como el numero indicado por parametro
		// anteriormente
		for (int i = 0; i < num; i++) {
			//atributos de vehicles
			System.out.println("Marca: ");
			String marca = sc.next();
			System.out.println("Color: ");
			String color = sc.next();
			System.out.println("Matricula: ");
			String matricula = sc.next();
			//atributos de coche
			System.out.println("Rueda delantera: ");
			System.out.println("Marca: ");
			String marcar = sc.next();
			System.out.println("Diametro: ");
			Double diametro = sc.nextDouble();
			System.out.println("Rueda trasera: ");
			System.out.println("Marca: ");
			String marcar2 = sc.next();
			System.out.println("Diametro: ");
			Double diametro2 = sc.nextDouble();
			arrayVehicle.add(new Camion(marca,color,matricula, new Rueda(marcar,diametro), new Rueda(marcar2, diametro2)));
		}
	}
	
	public static void showVehicles() {
		for (int i = 0; i < arrayVehicle.size(); i++) {
			System.out.println(i+" "+arrayVehicle.get(i));
		}
	}

	public static void menuPersona() {
		int num;
		do {// menu para mostrar las diferentes opciones de persona
			System.out.println("----------MENU PERSONAS----------");
			System.out.println("1-Introducir un conductor");
			System.out.println("2-Introducir un titular");
			System.out.println("3-Mostrar conductores");
			System.out.println("4-Mostrar titulares");
			System.out.println("0-Cerrar");
			num = sc.nextInt();
			if (num == 1)
				inConductor();
			else if (num == 2)
				inTitular();
			else if (num == 3)
				showConductor();
			else if(num == 4)
				showTitular();

		} while (num != 0);

	}

	public static void showConductor() {
		for (int i = 0; i < arrayPersonas.size(); i++) {
			if (arrayPersonas.get(i) instanceof Conductor)
				System.out.println(i+" "+arrayPersonas.get(i));// ejecuta el toString de Conductor
		}
	}

	public static void showTitular() {
		for (int i = 0; i < arrayPersonas.size(); i++) {
			if (arrayPersonas.get(i) instanceof Titular)
				System.out.println(arrayPersonas.get(i));// ejecuta el toString de Titular
		}
	}

	public static void inConductor() {
		System.out.println("Introduce el numero de conductores que quieras añadir:");
		int num = sc.nextInt();
		// bucle que se repetira tantas veces como el numero indicado por parametro
		// anteriormente
		for (int i = 0; i < num; i++) {
			// atributos de persona
			System.out.println("Nombre:");
			String name = sc.next();
			System.out.println("Apellidos:");
			String apellido = sc.next();
			System.out.println("Fecha de nacimiento: ");
			String nacimiento = sc.next();
			System.out.println("Numero de licencia: ");
			String licencia = sc.next();
			// atributos de conductor
			System.out.println("Informacion de la licencia");
			System.out.println("Id: ");
			String id = sc.next();
			System.out.println("Tipo de licencia: ");
			String tLicencia = sc.next();
			System.out.println("Fecha caducidad: ");
			String dCaducidad = sc.next();
			// incluimos a la persona en la array de personas
			arrayPersonas.add(new Conductor(name, apellido, nacimiento, licencia, id, (name + " " + apellido),
					tLicencia, dCaducidad));

		}
	}

	public static void inTitular() {
		System.out.println("Introduce el numero de titular que quieras añadir:");
		int num = sc.nextInt();
		// bucle que se repetira tantas veces como el numero indicado por parametro
		// anteriormente
		for (int i = 0; i < num; i++) {
			// atributos de persona
			System.out.println("Nombre:");
			String name = sc.next();
			System.out.println("Apellidos:");
			String apellido = sc.next();
			System.out.println("Fecha de nacimiento: ");
			String nacimiento = sc.next();
			System.out.println("Numero de licencia: ");
			String licencia = sc.next();
			// atributos de conductor
			System.out.println("Informacion de la licencia");
			System.out.println("Id: ");
			String id = sc.next();
			System.out.println("Tipo de licencia: ");
			String tLicencia = sc.next();
			System.out.println("Fecha caducidad: ");
			String dCaducidad = sc.next();
			// atributos de titular
			System.out.println("Tiene seguro? Si/No");
			String seguro = sc.next();
			Titular titular = new Titular(name, apellido, nacimiento, licencia, id, (name + " " + apellido),
					tLicencia, dCaducidad);
			// conduicion para el seguro
			if (seguro.equalsIgnoreCase("si"))
				titular.seguroTrue();
			else
				titular.seguroFalse();
			System.out.println("Tiene garaje? Si/No");
			String garaje = sc.next();
			// condicion para el garaje
			if (garaje.equalsIgnoreCase("si"))
				titular.garajeTrue();
			else
				titular.garajeFalse();
			// incluimos a la persona en la array de personas
			arrayPersonas.add(titular);

		}
	}

}