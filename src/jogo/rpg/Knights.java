package jogo.rpg;


public class Knights extends Personagen {

	public Knights(String nome, int atk, int def, float vida) {
		super(nome, atk, def, vida);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void imprimir() {
		System.out.println( "Tipo: Cavaleiro");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Força: " + this.getForça());
		System.out.println("Defesa: " + this.getDefesa());
		System.out.println("Vida: "+ this.getVida());
	}
}