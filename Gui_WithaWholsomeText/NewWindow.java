import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;  // Import JOptionPane

public class NewWindow implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello, User!");
    JLabel label2 = new JLabel("Just a simple Reminder");
    JLabel label3 = new JLabel("Life can be tough sometimes,");
    JLabel label4 = new JLabel("and it's in these moments of deep struggle that we truly face our own resilience.");
    JLabel label5 = new JLabel("When the weight of the world feels unbearable, it's okay to acknowledge the pain.");
    JLabel label6 = new JLabel("Each tear and heartache is a testament to your strength.");
    JLabel label7 = new JLabel("Embrace the journey, seek support, and hold onto hope.");
    JLabel label8 = new JLabel("Though the darkness seems endless, remember that you are growing stronger with every challenge.");
    JButton button = new JButton("Continue..");

    NewWindow() {
        // Set up the labels
        label.setBounds(165, 20, 400, 40);  // Adjusted size for visibility
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));  
        label.setForeground(Color.PINK);

        label2.setBounds(20, 60, 580, 40);
        label3.setBounds(20, 100, 580, 40);
        label4.setBounds(20, 140, 580, 40);
        label5.setBounds(20, 180, 580, 40);
        label6.setBounds(20, 220, 580, 40);
        label7.setBounds(20, 260, 580, 40);
        label8.setBounds(20, 290, 580, 40);

        // Set up the button
        button.setBounds(230, 400, 150, 40);  // Centered button
        button.setFocusable(false);
        button.setFont(new Font("Times New Roman", Font.BOLD, 18));  
        button.addActionListener(this);

        // Set up the frame
        frame.setSize(620, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Use absolute positioning
        
        // Add components to the frame
        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(button);
        
        // Make the frame visible
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // Show JOptionPane with the message

            
            
                JOptionPane.showMessageDialog(frame, "You got it, Buddy!");
            
            
            
            // Open the second window (assuming NewWindow2 exists)
          
        }
    }
}
