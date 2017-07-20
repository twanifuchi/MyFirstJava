package objectStudy;

public class SuperHero extends Hero {
	private boolean flying;

	public void attack(Matango m){
		super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}

	public void fly(){
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land(){
		this.flying = false;
		System.out.println("着地した！");
	}

	public void run(){
		System.out.println("撤退した");
	}

	public SuperHero(){
		System.out.println("SuperHeroのコンストラクタが動作");
	}

}
