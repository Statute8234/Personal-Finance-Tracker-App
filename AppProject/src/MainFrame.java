import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class MainFrame extends JFrame{
    final private Font mainFont = new Font("Times", Font.BOLD, 12);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;
    public void initialize() {
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);


        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);
        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);
        JButton btnOK = new JButton("Ok");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Hello " + firstName + " " + lastName);
            }
        });
        JButton btnClear = new JButton("CLear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
        });
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.setBackground(new Color(0, 0, 0, 255));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        JPanel mainPannel = new JPanel();
        mainPannel.setLayout(new BorderLayout());
        mainPannel.setBackground(new Color(255, 255, 255, 255));
        mainPannel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPannel.add(formPanel,BorderLayout.NORTH);
        mainPannel.add(lbWelcome,BorderLayout.CENTER);
        mainPannel.add(buttonsPanel,BorderLayout.SOUTH);

        add(mainPannel);

        setTitle("Welcome");
        setSize(600, 600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
