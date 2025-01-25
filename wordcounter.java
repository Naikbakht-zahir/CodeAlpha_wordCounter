import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wordcounter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        JLabel wordCountLabel = new JLabel("Word Count: 0");
        wordCountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(wordCountLabel, BorderLayout.SOUTH);

        JButton countButton = new JButton("Count Words");
        panel.add(countButton, BorderLayout.NORTH);

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                if (text.isEmpty()) {
                    wordCountLabel.setText("Word Count: 0");
                } else {
                    String[] words = text.trim().split("\\s+");
                    wordCountLabel.setText("Word Count: " + words.length);
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
