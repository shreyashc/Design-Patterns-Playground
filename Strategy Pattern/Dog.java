public class Dog extends Animal {

    public void digAHole() {
        System.out.println("Dug a hole");
    }

    public Dog() {
        super();
        setSound("Bark");
        setFlyingAbility(new CantFly());
    }

}
