package objectStudy;

public class Matango extends Monster {
	int hp = 50;
	private char suffix;

	public Matango(char suffix){
		this.suffix = suffix;
	}

	public void attack(Hero h){
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
	}

	public void run(){
		System.out.println("トコトコ逃げ出した！");
	}

}
