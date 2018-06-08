package facade;

public class TestFacade{
    public static void main(String [] args){
        customizeApp custApp=new customizeApp();
        custApp.changeSize();
        custApp.changeType();
        custApp.changeColor();
    }
}