import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world");

        // button add
        JButton button = new JButton("Click me");
        button.setBounds(100,100,100,50);
        frame.add(button);


        //textbox
        JTextArea textArea = new JTextArea(" Type here");
        textArea.setBounds(100,200,200,100);
        frame.add(textArea);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}