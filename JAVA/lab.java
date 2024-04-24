import javax.swing.*;

public class lab {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ProgressBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setValue(50);

        frame.getContentPane().add(progressBar);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
