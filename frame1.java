import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class frame1 extends JFrame implements ActionListener{
    public static void main(String[] args) {
    frame1 sc=new frame1();
    sc.setTitle("dhanu");
    sc.setResizable(false);
    sc.setLayout(null);
    Font f2=new Font("Arial",Font.BOLD,20);

ImageIcon img=new ImageIcon("C:\\Users\\karan\\Downloads\\WhatsApp Image 2024-04-04 at 19.40.23_4a7ea76f.jpg");
        sc.setIconImage(img.getImage());

        JLabel lb1=new JLabel();
        lb1.setText("Employee:");
        lb1.setBounds(20,40,280,40);
        lb1.setFont(new Font("Arial",Font.BOLD,25));
        sc.add(lb1);
    JButton a= new JButton("Insert");
    a.setBounds(160, 30, 120, 50);
    a.setFont(f2);
    sc.add(a);
    JButton b= new JButton("Update");
    b.setBounds(320, 30, 120, 50);
    b.setFont(f2);
    sc.add(b);
    JButton c= new JButton("Delete");
    c.setBounds(470, 30, 120, 50);
    c.setFont(f2);
    sc.add(c);



    a.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            new New_Frames();
        }
    });
    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            new Frame2();
            
        }
    });
    c.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          JOptionPane.showInputDialog("Enter id of employee: ");
          
        }
    });
    
   
    sc.setVisible(true);
    sc.setSize(650, 150);
    sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
