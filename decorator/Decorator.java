package decorator;
abstract class Decorator extends Contact{
    public Contact decorateContact;
    public Decorator(Contact decorateContact) {
        this.decorateContact=decorateContact;
    }
    abstract public void getinterest();
}
