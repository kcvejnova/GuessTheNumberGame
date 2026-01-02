import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessGame {
    public static void main (String[] args) {
        //random number
        int mySecretNumber = (int) (Math.random() * 100 + 1);

        JFrame window = new JFrame("Guess the number");
        window.setSize(400, 300);
        window.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        window.setLayout(new java.awt.FlowLayout());
        JLabel textLabel = new JLabel("Guess the number between 1 - 100");
        JTextField writingField = new JTextField(10);
        JButton guessButton = new JButton("Guess");
        JLabel resultLabel = new JLabel("I am waiting for a tip...");

        window.add(textLabel);
        window.add(writingField);
        window.add(guessButton);
        window.add(resultLabel);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultText = writingField.getText();
                int number = Integer.parseInt(resultText);

                if (number == mySecretNumber) {
                    resultLabel.setText("Thats correct. You guessed right!");
                }
                else if (number < mySecretNumber) {
                    resultLabel.setText("The number is higher. Guess again.");
                }
                else {
                    resultLabel.setText("The number is lower. Guess again.");
                }
                System.out.println(resultLabel);
            }
        });
        
        
        window.setVisible(true);
    }
}