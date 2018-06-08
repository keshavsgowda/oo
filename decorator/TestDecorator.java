package decorator;
public class TestDecorator{
    public static void main(String [] args){
        Contact c1=new Music(new MaleContact());
        c1.getinterest();
        Contact c2=new Dance(new MaleContact());
        c2.getinterest();
        Contact c3=new Dance(new FemaleContact());
        c3.getinterest();
    }
}
