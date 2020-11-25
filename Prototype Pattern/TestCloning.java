public class TestCloning {

    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.err.println(sally);
        System.err.println(clonedSheep);

        System.err.println("Sally Hash code " + sally.hashCode());
        System.err.println("Clone Hash code " + clonedSheep.hashCode());

    }
}
