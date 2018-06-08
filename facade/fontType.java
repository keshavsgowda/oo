package facade;
import java.util.*;

class fontType implements customize{
    public void change(){
        String t;
        System.out.println("ENTER THE NEW FONT TYPE:");
        Scanner c=new Scanner(System.in);
        t=c.next();
        System.out.println("FONT TYPE CHANGED TO "+t);
    }
}