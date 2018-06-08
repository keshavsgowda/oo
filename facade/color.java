package facade;

import java.util.Scanner;

class color implements customize{
    public void change(){
        String color;
        System.out.println("ENTER THE NEW COLOR:");
        Scanner m=new Scanner(System.in);
        color=m.nextLine();
        System.out.println("COLOR CHANGED TO "+color);
    }
}