import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class first extends JFrame 
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel l1,l2;
JButton b1,b2;
public first()
{
Container d=getContentPane();
d.setLayout(null);

l2=new JLabel("Text  Encryption and  Decryption",JLabel.CENTER);
l2.setFont(new Font("Times New Roman",Font.BOLD,50));
l2.setBounds(180,50,1000,100);
l2.setForeground(new Color(250,250,250));
d.add(l2);

b1=new JButton("Encryption");
b1.setFont(new Font("Cooper",Font.BOLD,25));
b1.setForeground(new Color(0,0,117));

b2=new JButton("Decryption");
b2.setFont(new Font("Cooper",Font.BOLD,25));
b2.setForeground(new Color(0,0,117));

b1.setBounds(400,350,250,50);
b2.setBounds(750,350,250,50);
d.add(b1);
d.add(b2);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent tt){
new Test2();
}});

b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent tt){
new Test3();
}});

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel l1=new JLabel(new ImageIcon(this.getClass().getResource("/11.jpg")));
l1.setBounds(0,0,1360,700);
d.add(l1);


setSize(1360,700);
setVisible(true);
}
public static void main(String[] args)
{
new first();
}

}
