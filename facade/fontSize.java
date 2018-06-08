package facade;

import java.util.Scanner;

class fontSize implements customize{
    public void change(){
        int s;
        System.out.println("ENTER THE NEW FONT SIZE:");
        Scanner in=new Scanner(System.in);
        s=in.nextInt();
        System.out.println("FONT SIZE CHANGED TO "+s);
    }
}