import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends JFrame implements ActionListener{

    Frame2() {
        setTitle("Employee");
        setResizable(false);
        setLayout(null);
        Font f1=new Font("Arial",Font.BOLD,20);


        ImageIcon img=new ImageIcon("C:\\Users\\karan\\Downloads\\WhatsApp Image 2024-04-04 at 19.40.23_4a7ea76f.jpg");
        setIconImage(img.getImage());


        JLabel roll=new JLabel("Employee ID:");
        roll.setBounds(10, 30, 200, 20);
        roll.setFont(f1);
        add(roll);
        JTextField rollNo=new JTextField(25);
        rollNo.setBounds(150, 20, 220, 40);
        rollNo.setFont(f1);
        add(rollNo);

        JButton View=new JButton("View");
        View.setFont(f1);
        View.setBounds(375, 20, 100, 40);
        add(View);


        JLabel combo=new JLabel("Select:");
        combo.setBounds(60, 100, 200, 20);
        combo.setFont(f1);
        add(combo);
        JComboBox dropBox = new JComboBox();
        dropBox.setFont(f1);
        dropBox.setBounds(150,80,200,50);
        dropBox.addItem("Mustang");
        dropBox.addItem("Stingray");
        dropBox.addItem("Dodge");
        dropBox.addItem("GTR");
        dropBox.addItem("Skyline");

        add(dropBox);

        JLabel Value=new JLabel("Enter the Value:");
        Value.setBounds(30, 160, 200, 20);
        Value.setFont(f1);
        add(Value);
        JTextField ValueNo=new JTextField(25);
        ValueNo.setBounds(200, 160, 220, 40);
        ValueNo.setFont(f1);
        add(ValueNo);




        JButton Update = new JButton("Upadate");
        Update.setBounds(60, 210, 150, 40);
        Update.setFont(f1);
        add(Update);

        JButton nclear = new JButton("Clear");
        nclear.setBounds(240, 210, 150, 40);
        nclear.setFont(f1);
        add(nclear);





        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

}
