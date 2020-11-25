import java.util.LinkedList;

public class ScrabbleTest {
    public static void main(String[] args) {
        Singleton newInstance = Singleton.getInstance();

        System.out.println("1st instance id: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);

        System.out.println("Player 1: tiles: " + playerOneTiles);

        System.out.println(newInstance.getLetterList());

        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("1st instance id: " + System.identityHashCode(instanceTwo));

        System.out.println(instanceTwo.getLetterList());

        LinkedList<String> playerTwoTiles = instanceTwo.getTiles(7);

        System.out.println("Player two tiles: " + playerTwoTiles);

    }
}
