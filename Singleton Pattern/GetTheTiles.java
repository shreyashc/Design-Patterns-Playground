import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println("Player 1: " + playerOneTiles);
        System.out.println("Got Tiles");
    }

}
