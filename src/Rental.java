import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rental {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new RentalView();
                ImageIcon img = new ImageIcon("../images/logo.GIF");
                frame.setIconImage(img.getImage());
                frame.setTitle("Car Rental System");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(WIDTH, HEIGHT);
                frame.setResizable(false);

                // Load the image in a separate thread
                Thread imageLoadingThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(5000); // Simulate image loading
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                frame.setVisible(true);
                            }
                        });
                    }
                });

                imageLoadingThread.start();
            }
        });
    }
}