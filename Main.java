import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("El Birdo");
        // frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ElBirdo flappyBird = new ElBirdo();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
