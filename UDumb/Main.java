    
    package UDumb;
    import java.awt.*;
    import javax.swing.*;
    import java.util.Random;
    public class Main {
        static Random rand = new Random();
        static JFrame frame = new JFrame("Você é burro?");
        static JPanel panel = new JPanel();
        static JButton yesBtn = new JButton("Sim");
        static JButton noBtn = new JButton("Não");
        static JLabel question = new JLabel("Você é burro???", SwingConstants.CENTER);
        static JLabel imageLabel = new JLabel();

         void window() {
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.setResizable(false);
            frame.setPreferredSize(new Dimension(400, 300));

            ImageIcon ii = new ImageIcon(this.getClass().getResource(
                    "goose.gif"));
            imageLabel.setIcon(ii);

            panel.setLayout(new FlowLayout());

            question.setFont(new Font("SansSerif", Font.BOLD, 25));;

            yesBtn.addActionListener(e -> Yes());
            noBtn.addActionListener(e -> No());

            panel.add(yesBtn, BorderLayout.CENTER);
            panel.add(noBtn, BorderLayout.CENTER);
            frame.add(question, BorderLayout.NORTH);
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        }

        static void Yes() {
            frame.setDefaultCloseOperation(3);
            question.setText("Eu já sabia");
            panel.remove(yesBtn);
            panel.remove(noBtn);
            panel.add(imageLabel);
            frame.pack();
        }

        static void No() {
            int X = rand.nextInt(panel.getWidth()-10);
            int Y = rand.nextInt(panel.getHeight()-10);
            noBtn.setLocation(X, Y);
        }
public static void main(String[] args) {
        Main wind = new Main();
        wind.window();
    }
}