import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JTextField inputWord;
    private JButton searchButton;
    private JTextPane meaningText;
    private JButton deleteButton;
    private JButton saveButton;
    private JComboBox conversionCb;
    private JButton addNewWordButton;
    private JButton favoriteWordsButton;
    private JButton historyButton;

    public MainFrame(Dictionary<String,String> englishToVietnamese, Dictionary<String,String> vietnameseToEnglish){
        setContentPane(mainPanel);
        setTitle("Dictionary");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String save = "save";
                new AlertFrame("Are you want to save to Favorite words?", save);
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String delete = "delete";
                new AlertFrame("Are you sure to delete this word?", delete);
            }
        });
        addNewWordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddNewWordFrame();
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = inputWord.getText();
                String meaning = englishToVietnamese.get(word);
                meaningText.setText(meaning);
            }
        });
    }
}
