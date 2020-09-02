package experiment;

import java.util.Scanner;

public class TestBMI {
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		BMI bmi = new BMI(input.next(), input.nextInt(),input.nextDouble(),input.nextDouble());
		System.out.println("姓名：" + bmi.getName() + '\n' + "年龄：" + bmi.getAge() + '\n'
				+ "体重指数：" + bmi.getBMI() + '\n' + "体重状况：" + bmi.getStatus());
	}
}

package experiment;

public class BMI {
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public BMI() {
	}

	public BMI(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public BMI(String name, int age, double weight, double height) {
		this(weight, height);
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getBMI(){
		return weight/(height * height);
	}
	
	public String getStatus(){
		double bmi = getBMI();
		if (bmi < 18.5)
			return "低重";
		else if (bmi < 25)
			return "正常";
		else if (bmi < 30)
			return "超重";
		else
			return "肥胖";
	}
	
}
