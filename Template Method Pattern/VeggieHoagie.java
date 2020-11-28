public class VeggieHoagie extends Hoagie {
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    @Override
    boolean customerWantsMeat() {
        return false;
    }

    @Override
    boolean customerWantsCheese() {
        return false;
    }

    @Override
    void addVegetables() {
        System.out.println("Adding the vegetables: ");
        for (String vegetable : veggiesUsed) {
            System.out.println(vegetable + " ");
        }

    }

    @Override
    void addCondiment() {
        System.out.println("Adding the condiments: ");
        for (String contiment : condimentsUsed) {
            System.out.println(contiment + " ");
        }

    }

    @Override
    void addMeat() {

    }

    @Override
    void addCheese() {

    }
}
