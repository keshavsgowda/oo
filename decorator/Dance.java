package decorator;
class Dance extends Decorator{
    public Dance(Contact decorateContact){
        super(decorateContact);
    }

    public void getinterest(){
        decorateContact.getinterest();
        setTalent(decorateContact);
    }

    private void setTalent(Contact decorateContact){
        System.out.println("I CAN DANCE");
    }
}