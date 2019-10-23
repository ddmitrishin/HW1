package HW4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextChat {
    private JList<String> listitems;
    private JTextField custominputtext;
    private JButton sendButton;
    private JPanel panel1;

    public TextChat(){
        DefaultListModel listModel = new DefaultListModel();
        listitems.setModel(listModel);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(custominputtext.getText());
                custominputtext.setText("");
            }
        });
        custominputtext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(custominputtext.getText());
                custominputtext.setText("");
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("TextChat");
        frame.setContentPane(new TextChat().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bye from menu!");
                frame.dispose();
            }
        });


        menu.add(exitMenuItem);

        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Bye!");
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
