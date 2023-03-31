import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewWordFrame extends JFrame{
    private JTextField textField1;
    private JTextPane textPane1;
    private JButton OKButton;
    private JButton cancelButton;
    private JPanel addFrame;

    public AddNewWordFrame(){
        setContentPane(addFrame);
        setTitle("Add new word");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String addOK = "addOK";
                new AlertFrame("This word is already existed. Do you want to overwrite?", addOK);
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}
