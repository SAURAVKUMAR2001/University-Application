package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    
    About() {
      setSize(700, 500);
      setLocation(400, 150);
      
      getContentPane().setBackground(Color.WHITE);
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
      Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(350, 0, 300, 200);
      add(image);
      
      JLabel heading = new JLabel("<html>University<br/>Application</html>");
      heading.setBounds(70, 20, 300, 130);
      heading.setFont(new Font("Tahoma", Font.BOLD, 30));
      add(heading);
      
      JLabel name = new JLabel("Developed By: Saurav Kumar");
      name.setBounds(70, 220, 550, 40);
      name.setFont(new Font("Tahoma", Font.BOLD, 30));
      add(name);
      
      JLabel rollno = new JLabel("Roll number: 0103IS201045");
      rollno.setBounds(70, 280, 550, 40);
      rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
      add(rollno);
      
      JLabel contact = new JLabel("Contact: sk8235706363@gmail.com");
      contact.setBounds(70, 340, 550, 40);
      contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
      add(contact);
      
      JLabel phone = new JLabel("Mobile No: 8235706363");
      phone.setBounds(70, 380, 550, 40);
      phone.setFont(new Font("Tahoma", Font.PLAIN, 20));
      add(phone);
      
      setLayout(null);
      setVisible(true);
   }

   public static void main(String[] args) {
      new About();
   }
    
}
