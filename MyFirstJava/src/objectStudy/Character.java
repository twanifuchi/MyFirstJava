package objectStudy;

public class Character {
	String name;
	private int hp;

	public void run(){
		System.out.println("逃げ出した！");
	}

	public void attack(Monster m){
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
