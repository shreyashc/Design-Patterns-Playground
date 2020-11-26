public class Originator {
    private String article;

    public void set(String newArticle) {
        System.out.println("From Originator: Current version of Article\n" + newArticle + "\n");
        this.article = newArticle;
    }

    public Memento storeInMemeto() {
        System.out.println("From Originator: saving to Memento");
        return new Memento(article);
    }

    public String restoreFromMemento(Memento memento) {
        article = memento.getSavedArticle();
        System.out.println("From Originator: Previous article was saved\n" + article + "\n");

        return article;
    }

}
