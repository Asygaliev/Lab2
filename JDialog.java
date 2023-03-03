import javax.swing.*;
import java.awt.event.*;

public class JDialog extends javax.swing.JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;

    public JDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = formattedTextField1.getText();
                int midIndex = inputText.length() / 2;
                String rightText = inputText.substring(midIndex);
                String outputText = "";
                for (int i = 0; i < rightText.length(); i += 3) {
                    if (i + 2 < rightText.length()) {
                        outputText += rightText.substring(i, i+2);
                    } else {
                        outputText += rightText.substring(i);
                    }
                }
                formattedTextField2.setText(outputText);
            }
        });

    }

    public static void main(String[] args) {
        JDialog dialog = new JDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
