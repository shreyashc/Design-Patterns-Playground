import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> savedArticles = new ArrayList<>();

    public void addMemento(Memento m) {
        savedArticles.add(m);
    }

    public Memento getMemento(int index) {
        return savedArticles.get(index);
    }
}
