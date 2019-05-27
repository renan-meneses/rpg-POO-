package jogo.rpg;


public class Personagen {
	
	private String nome;
	private int força;
	private int defesa;
	private float vida;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getForça() {
		return força;
	}
	public void setForça(int força) {
		this.força = força;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public float getVida() {
		return vida;
	}
	public void setVida(float vida) {
		this.vida = vida;
	}
	
	
	
	public Personagen (String nome, int atk, int def, float vida) {
		this.setNome(nome);
		this.setForça(atk);
		this.setDefesa(def);
		this.setVida(vida);
		
		
		
	}
	//cajados
	Arma cajado_1 = new Arma("Cajado negro", 20 , 20);
	Arma cajado_2 = new Arma("Cajado Gandof", 100 , 100);
	//espadas
	Arma espada_1 = new Arma("Espada Gloriosa", 20, 15);
	Arma espada_2 = new Arma("Espada Griffidor", 80, 75);
	//machados
	Arma machado_1 = new Arma("Machado Infernal", 40, 35);
	Arma machado_2 = new Arma("Machado Viking", 95, 65);
	
	public void equipe_cajado(int opc) {
		System.out.println("Qual cajado voce vai equipar?\n");
		System.out.println("1 -Cajado negro\n " + "2 - Cajado Gandof\n");
		switch(opc) {
		
		case 1 :
			setForça(getForça() + cajado_1.getAtk());
			setDefesa(getDefesa() + cajado_1.getDef());
			System.out.println("Arma equipada: " + cajado_1.getType());
			System.out.println("Força equipada: " + getForça() + " atk");
			System.out.println("Defesa equipada: " + getDefesa()+ " def");
			break;
		case 2:
			setForça(getForça() + cajado_2.getAtk());
			setDefesa(getDefesa() + cajado_2.getDef());
			System.out.println("Arma equipada: " + cajado_2.getType());
			System.out.println("Força equipada: " + getForça() + " atk");
			System.out.println("Defesa equipada: " + getDefesa()+ " def");
				
			break;
		}
	}
		public void equipe_espada(int opc) {
			System.out.println("Qual espada voce vai equipar?\n");
			System.out.println("1 -Espada Gloriosa \n " + "2 - Espada de Grinffidor\n");
			switch(opc) {
			
			case 1 :
				setForça(getForça() + espada_1.getAtk());
				setDefesa(getDefesa() + espada_1.getDef());
				System.out.println("Arma equipada: " + espada_1.getType());
				System.out.println("Força equipada: " + getForça() + " atk");
				System.out.println("Defesa equipada: " + getDefesa()+ " def");
				break;
			case 2:
				setForça(getForça() + espada_2.getAtk());
				setDefesa(getDefesa() + espada_2.getDef());
				System.out.println("Arma equipada: " + espada_2.getType());
				System.out.println("Força equipada: " + getForça() + " atk");
				System.out.println("Defesa equipada: " + getDefesa()+ " def");
					
				break;
			}
		}
			public void equipe_machado(int opc) {
				System.out.println("Qual machado voce vai equipar?\n");
				System.out.println("1 -Machado Infernal " + "2 - Machado Viking\n");
				switch(opc) {
				
				case 1 :
					setForça(getForça() + machado_1.getAtk());
					setDefesa(getDefesa() + machado_1.getDef());
					System.out.println("Arma equipada: " + machado_1.getType());
					System.out.println("Força equipada: " + getForça() + " atk");
					System.out.println("Defesa equipada: " + getDefesa()+ " def");
					break;
				case 2:
					setForça(getForça() + machado_2.getAtk());
					setDefesa(getDefesa() + machado_2.getDef());
					System.out.println("Arma equipada: " + machado_2.getType());
					System.out.println("Força equipada: " + getForça() + " atk");
					System.out.println("Defesa equipada: " + getDefesa()+ " def");
						
					break;
				}
		}
	
	

}
