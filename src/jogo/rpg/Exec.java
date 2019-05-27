package jogo.rpg;

import java.util.Scanner;

public class Exec {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Qual classe quer?\n");
		System.out.println("1 - Mago\n" + "2 - Cavaleiro\n" + "3 - Gladiador\n");
		System.out.println("Escolha: ");
	Scanner scanner = new Scanner(System.in);
	int opc = scanner.nextInt();
	switch (opc) {
	case 1:
		Mago mago = new Mago("Merlin", 20, 20, 200);
			System.out.println(mago);
			mago.imprimir();
			mago.equipe_cajado(scanner.nextInt());
			
						
		break;
	case 2:
		Knights knights = new Knights("Lancelote", 10, 15, 200);
		System.out.println(knights);
		knights.imprimir();
		
		knights.equipe_espada(scanner.nextInt());
		break;
	case 3:
		Gladiador gladiador = new Gladiador("Leonidas", 20, 15, 200);
		
		System.out.println(gladiador);
		gladiador.imprimir();
		
		gladiador.equipe_machado(scanner.nextInt());
		break;

	default:
		break;
	}
	}

}
