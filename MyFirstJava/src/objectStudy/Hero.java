package objectStudy;

public class Hero extends Character {

	public void attack(Matango m){
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("敵に5ポイントのダメージを与えた！");
		}

	public void run(){
		System.out.println(this.name + "は逃げ出した！");
	}

	public String toString(){
		return "名前:" + this.name + "／HP:" + this.getHp();
	}

	public boolean equals(Object o){
		if(this == o){return true;}
		if(o instanceof Hero){
			Hero h = (Hero)o;
			if(this.name.equals(h.name)){
				return true;
			}
		}
	return false;
	}

}
