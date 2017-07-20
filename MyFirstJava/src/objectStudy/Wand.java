package objectStudy;

public class Wand {
	private String name;
	private double power;

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		if (name == null){
			throw new IllegalArgumentException("名前がnull。処理を中断。");
		}
		if (name.length() < 3){
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}

		this.name = name;
	}

	public double getPower(){
		return this.power;
	}

	public void setPower(double power){
		if (power < 0.5 || 100.0 < power){
			throw new IllegalArgumentException("powerが不正である。処理を中断。");
		}
		this.power = power;
	}
	Wand(String name, double power){
		this.name = name;
		this.power = power;
	}

	Wand(String name){
		this(name, 1);
	}

	Wand(){
		this("名無しの杖", 1);
	}
}
