import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class New_Frames extends JFrame implements ActionListener{

    New_Frames() {
        setTitle("dhanu");
        setResizable(false);
        setLayout(null);
ImageIcon img=new ImageIcon("C:\\Users\\karan\\Downloads\\WhatsApp Image 2024-04-04 at 19.40.23_4a7ea76f.jpg");
        setIconImage(img.getImage());


        
        JLabel lb1=new JLabel();
        lb1.setText("Employee ID:");
        lb1.setBounds(10,20,280,20);
        add(lb1);
        Font fo=new Font("Arial",Font.BOLD,20);
        lb1.setFont(fo);
        JTextField ID=new JTextField(25);
        ID.setBounds(180,10,280,40);
        ID.setFont(fo);
        add(ID);
    
    
    
        JLabel lb2=new JLabel();
        lb2.setText("Empolyee Name:");
        lb2.setBounds(10,70,200,20);
        add(lb2);
        lb2.setFont(fo);
        JTextField name=new JTextField(25);
        name.setBounds(180,60,280,40);
        name.setFont(fo);
        add(name);
    
    
    
        JLabel lb3=new JLabel();
        lb3.setText("Empolyee Age:");
        lb3.setBounds(10,120,200,20);
        add(lb3);
        lb3.setFont(fo);
        JTextField Age=new JTextField(25);
        Age.setBounds(180,110,280,40);
        Age.setFont(fo);
        add(Age);
    
    
        JLabel lb4=new JLabel();
        lb4.setText("Employee Salary:");
        lb4.setBounds(10,170,200,20);
        add(lb4);
        lb4.setFont(fo);
        JTextField Sal=new JTextField(25);
        Sal.setBounds(180,160,280,40);
        Sal.setFont(fo);
        add(Sal);
    
    
        JLabel lb5=new JLabel();
        lb5.setText("Experience:");
        lb5.setBounds(10,220,200,20);
        add(lb5);
        lb5.setFont(fo);
        JTextField Experience=new JTextField();
        Experience.setBounds(180,210,280,40);
        Experience.setFont(fo);
        add(Experience);
    
        JLabel lb6=new JLabel();
        lb6.setText("Gender:");
        lb6.setBounds(10,270,200,20);
        add(lb6);
        lb6.setFont(fo);
        JTextField gender=new JTextField();
        gender.setBounds(180,260,280,40);
        gender.setFont(fo);
        add(gender);
    
        JLabel lb7=new JLabel();
        lb7.setText("Employee Role:");
        lb7.setBounds(10,320,200,20);
        add(lb7);
        lb7.setFont(fo);
        JTextField Roll=new JTextField(25);
        Roll.setBounds(180,310,280,40);
        Roll.setFont(fo);
        add(Roll);
    

        JButton submit = new JButton("Submit");
        submit.setBounds(100, 370, 100, 40);
        add(submit);

        JButton clear = new JButton("Clear");
        clear.setBounds(220, 370, 100, 40);
        add(clear);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                        if (ID.getText().isEmpty() || name.getText().isEmpty() || Age.getText().isEmpty()
                                || Sal.getText().isEmpty() || gender.getText().isEmpty() || Experience.getText().isEmpty()
                                || Roll.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(New_Frames.this, "Please fill in all fields.",
                                    "Incomplete Form", JOptionPane.WARNING_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(New_Frames.this, "Form submitted successfully.",
                                    "Submission Successful", JOptionPane.INFORMATION_MESSAGE);


                                    try (Connection conn = DriverManager.getConnection(url, root, pass);
                                    Statement st = conn.createStatement()) {
                                
                                       String query = "INSERT INTO employee(id,name,age,salary,gender,exp,roll) VALUES (" + ID.getText() + ", '" + name.getText() + "', '" + Age.getText() + "'," + Sal.getText() + ",'" + gender.getText() + "','" + Experience.getText() + "','" + Roll.getText() + "')";
                                       st.executeUpdate(query);
                       
                                   System.out.println("Data insertion complete.");
                       
                               } catch (SQLException n) {
                                   System.out.println("SQL Exception: " + n.getMessage());
                               }

                            ID.setText("");
                            name.setText("");
                            Age.setText("");
                            Sal.setText("");
                            gender.setText("");
                            Experience.setText("");
                            Roll.setText("");
                        }

            }
        });
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(New_Frames.this, "Are You Sure",
                "Incomplete Form", JOptionPane.WARNING_MESSAGE);


                ID.setText("");
                name.setText("");
                Age.setText("");
                Sal.setText("");
                gender.setText("");
                Experience.setText("");
                Roll.setText("");


            }
        });


        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
  

}
