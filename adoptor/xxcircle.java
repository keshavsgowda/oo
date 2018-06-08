import java.util.Scanner;

public class xxcircle implements imethod {
	Scanner sc = new Scanner (System.in);
	@Override
	public void locationset(int a) {
		// TODO Auto-generated method stub
		System.out.println("location set at:"+a);

	}

	@Override
	public void locationget(int a) {
		// TODO Auto-generated method stub
		System.out.println("enter location to set ");
		int b=sc.nextInt();
		locationset(b);
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("displaying  xxcircle");

	}

	@Override
	public void fillcolour() {
		// TODO Auto-generated method stub
		System.out.println("filling in xxcircle");

	}

	@Override
	public void colourset() {
		// TODO Auto-generated method stub
		System.out.println("Setting colout in xxcircle");

	}

}
