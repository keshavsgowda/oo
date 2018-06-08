import java.util.Scanner;

public class Shape {

	Scanner sc = new Scanner(System.in);
	void setLocation(int a) {
		System.out.println("location set at:"+a);
	}
	void getLocation() {
		System.out.println("enter location to set ");
		int b=sc.nextInt();
		setLocation(b);
	}
	void fill() {}
	void display() {}
	void setColour() {}
	
}
