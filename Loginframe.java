
package loginframe;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Loginframe extends JFrame{

    private JLabel userLabel,passLabel;
     private JButton loginButton,clearButton;
    private JTextField tf;
    private JPasswordField pf;
    
    private Container c;
    private Font f;
   
    Loginframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setBounds(100, 50, 420, 350);
        this.setTitle("This is Loginframe");
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        f=new Font("Arial",Font.BOLD,18);
        userLabel=new JLabel("Username:");
        userLabel.setBounds(50, 50, 150, 50);
        userLabel.setFont(f);
        c.add(userLabel);
        tf=new JTextField();
        tf.setBounds(170, 50, 200, 50);
        c.add(tf);
        passLabel=new JLabel("Password:");
        passLabel.setBounds(50, 120, 150, 50);
        passLabel.setFont(f);
        c.add(passLabel);
        pf=new JPasswordField();
        pf.setBounds(170, 120, 200, 50);
        pf.setEchoChar('*');
        pf.setFont(f);
        c.add(pf);
        
        loginButton=new JButton("Login");
        loginButton.setBounds(170, 190, 90,50);
        loginButton.setFont(f);
        c.add(loginButton);
        
        
        
        clearButton=new JButton("clear");
        clearButton.setBounds(280, 190, 90,50);
        clearButton.setFont(f);
        c.add(clearButton);
        clearButton.addActionListener(new ActionListener (){

            @Override
            public void actionPerformed(ActionEvent ae) {
             tf.setText(" ");
             pf.setText(" ");
            }
        
        
        
        
        
        
        
        
        
        
        
        });
        
        loginButton.addActionListener(new ActionListener (){

            @Override
            public void actionPerformed(ActionEvent ae) {
           String username=tf.getText();
           String password=pf.getText();
           if(username.equals("anis")&& password.equals("123")){
               
               
               JOptionPane.showMessageDialog(null, "You are successfully logined");
           }
           else{
               JOptionPane.showMessageDialog(null, "please dear Try again");
           }
            }
           
           
        
        
        
        
        
        
        
        
        
        
        
        });
        
        
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        Loginframe frame =new Loginframe();
        frame.setVisible(true);
        
       
    }
    
}
