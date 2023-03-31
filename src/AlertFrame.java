import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlertFrame extends JFrame {
    private JPanel alertPanel;
    private JButton OKButton;
    private JButton cancelButton;
    private JLabel alertText;

    public AlertFrame(String text, String key){
        alertText.setText(text);

        setContentPane(alertPanel);
        setTitle("Alert");
        setSize(350,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (key){
                    case "save":
                    case "delete":
                    case "add":
                    default:
                }
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
