package decorator;
class Music extends Decorator{
    public Music(Contact decorateContact){
        super(decorateContact);
    }

    public void getinterest(){
        decorateContact.getinterest();
        setTalent(decorateContact);
    }

    private void setTalent(Contact decorateContact){
        System.out.println("I CAN SING");
    }
}
