import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.*;

@SuppressWarnings("serial")
public class TestMemento extends JFrame {

    public static void main(String[] args) {
        new TestMemento();
    }

    private JButton saveBtn, undoBtn, redoBtn;
    private JTextArea theArticle = new JTextArea(40, 60);

    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();
    int saveFiles = 0, currentArticle = 0;

    public TestMemento() {
        this.setSize(750, 780);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Article"));
        panel1.add(theArticle);

        ButtonListner saveListner = new ButtonListner();
        ButtonListner undoListner = new ButtonListner();
        ButtonListner redoListner = new ButtonListner();

        saveBtn = new JButton("Save");
        saveBtn.addActionListener(saveListner);

        undoBtn = new JButton("Undo");
        undoBtn.addActionListener(undoListner);

        redoBtn = new JButton("Redo");
        redoBtn.addActionListener(redoListner);

        panel1.add(saveBtn);
        panel1.add(undoBtn);
        panel1.add(redoBtn);

        this.add(panel1);
        this.setVisible(true);
    }

    class ButtonListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == saveBtn) {
                String textInTextArea = theArticle.getText();
                originator.set(textInTextArea);
                caretaker.addMemento(originator.storeInMemeto());

                saveFiles++;
                currentArticle++;
                System.out.println("Save Files " + saveFiles);
                undoBtn.setEnabled(true);
            } else if (e.getSource() == undoBtn) {
                if (currentArticle >= 1) {
                    currentArticle--;
                    String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentArticle));

                    theArticle.setText(textBoxString);
                    redoBtn.setEnabled(true);
                } else {
                    undoBtn.setEnabled(false);
                }
            } else {
                if (e.getSource() == redoBtn) {
                    if ((saveFiles - 1) > currentArticle) {
                        currentArticle++;
                        String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentArticle));

                        theArticle.setText(textBoxString);

                        undoBtn.setEnabled(true);
                    } else {
                        redoBtn.setEnabled(false);
                    }
                }
            }

        }

    }
}
