package jogo.rpg;

public class Arma {
	
	private String type;
	private int atk;
	private int def;

	public Arma ( String nome, int atk, int def) {
		this.setType(nome);
		this.setAtk(atk);
		this.setDef(def);
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	

}
