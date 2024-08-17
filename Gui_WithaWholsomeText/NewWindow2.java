    import java.awt.Font;
    import javax.swing.JFrame;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JButton;
    
    public class NewWindow2 {
        
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Hello");
        JButton button = new JButton("Click me");
    
        NewWindow(){
    
            label.setBounds(0, 0, 100, 50);
            label.setFont(new Font(null, Font.PLAIN, 25));
    
            button.setBounds(100, 160, 200, 40);
            button.setFocusable(false);
    
            frame.add(label);
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLayout(null);
            frame.add(button);
    
        
        }

        public static void main(String[] args) {

            NewWindow2 window2 = new NewWindow2();
        }
        
    
        }
        
    
    
    

