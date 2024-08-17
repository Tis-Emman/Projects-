import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Project implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("New window");
    JLabel label = new JLabel("Welcome, dear User");
    JLabel label2 = new JLabel("Click this button");
    
    // Define file path and audio stream
    File file = new File("Wave to earth.wav");
    AudioInputStream audioStream;
    Clip audioClip;

    Project() {
        // Set up the button
        button.setBounds(100, 160, 200, 40);
        button.setForeground(Color.blue);
        button.setFont(new Font("Times New Roman", Font.BOLD, 18));
        button.addActionListener(this);

        // Set up the labels
        label.setBounds(150, 100, 200, 40);
        label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        label2.setBounds(150, 120, 200, 40);

        // Set up the frame
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(button);
        frame.add(label);
        frame.add(label2);
        frame.setVisible(true);

        // Initialize audio playback
        try {
            audioStream = AudioSystem.getAudioInputStream(file);
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            // dispose 
            frame.dispose();

                audioClip.start();
            // opeN
            new NewWindow();
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
