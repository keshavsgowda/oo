package facade;
class customizeApp{
    private customize size;
    private customize type;
    private customize col;

    public customizeApp() {
        size = new fontSize();
        type = new fontType();
        col = new color();
    }

    public void changeSize(){
        size.change();
    }

    public void changeType(){
        type.change();
    }

    public void changeColor(){
        col.change();
    }
}