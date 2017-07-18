import java.io.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Test3 extends JFrame
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel l1,l2,l3,l4,l5,l6;
JButton b1,b2,b3,b4;
JTextField t1,t2,t3;
JTextArea ta1;
public Test3()
{
Container d=getContentPane();
d.setLayout(null);
l4=new JLabel("Decryption Process",JLabel.CENTER);
l5=new JLabel("File Is ->");
l6=new JLabel("");
l1=new JLabel("Share1");
l2=new JLabel("Share2");
l3=new JLabel("Share3");
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
b1=new JButton("Browse");
b2=new JButton("Browse");
b3=new JButton("Browse");
b4=new JButton("Decrypt");
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent tt){
JFileChooser fc=new JFileChooser();
int kk=fc.showOpenDialog(Test3.this);
if(kk==JFileChooser.APPROVE_OPTION)
{
fc.getSelectedFile().getPath();
t1.setText(fc.getSelectedFile().getPath());
}
}});

b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent tt){
JFileChooser fc=new JFileChooser();
int kk=fc.showOpenDialog(Test3.this);
if(kk==JFileChooser.APPROVE_OPTION)
{
fc.getSelectedFile().getPath();
t2.setText(fc.getSelectedFile().getPath());
}
}});

b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent tt){
JFileChooser fc=new JFileChooser();
int kk=fc.showOpenDialog(Test3.this);
if(kk==JFileChooser.APPROVE_OPTION)
{
fc.getSelectedFile().getPath();
t3.setText(fc.getSelectedFile().getPath());
}
}});

b4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent tt){
try{
 Color[][] colors1 = ImageUtil.loadPixelsFromImage(new File(t1.getText().trim()));
 Color share1_color = new Color(255, 0, 0);
 if(colors1[0][0].getRGB() != share1_color.getRGB()){
     JOptionPane.showMessageDialog(null,"Incorrect Share 1 file. Please verify.","Invalid share 1 file",3);
 //    System.out.println("p1 " + colors1[0][0]);
     return;
}
String result1="";
 for(int i=1;i<colors1.length;i++)
{
for(int j=1;j<colors1[i].length;j++)
{

int a1=colors1[i][j].getRed();
int a2=colors1[i][j].getGreen();
int a3=colors1[i][j].getBlue();
String xx="";
char x=(char) a1;
if(Character.isLetter(x) || Character.isDigit(x) || x==' ' || x=='.' || x==',' || x=='/' || x==';' || x=='"' || x=='+' || x=='-' || x=='?' || x=='#' || x=='!' || x=='@' || x=='$' || x=='*' || x=='&' || x=='%' || x=='^' || x=='(' || x==')' || x=='_' || x=='=' || x=='{' || x=='}' || x=='[' || x==']' || x==':' || x=='<' || x=='>' || x=='|')
xx=xx+x;
x=(char) a2;
if(Character.isLetter(x) || Character.isDigit(x) || x==' ' || x=='.' || x==',' || x=='/' || x==';' || x=='"' || x=='+' || x=='-' || x=='?' || x=='#' || x=='!' || x=='@' || x=='$' || x=='*' || x=='&' || x=='%' || x=='^' || x=='(' || x==')' || x=='_' || x=='=' || x=='{' || x=='}' || x=='[' || x==']' || x==':' || x=='<' || x=='>' || x=='|')
xx=xx+x;
x=(char) a3;
if(Character.isLetter(x) || Character.isDigit(x) || x==' ' || x=='.' || x==',' || x=='/' || x==';' || x=='"' || x=='+' || x=='-' || x=='?' || x=='#' || x=='!' || x=='@' || x=='$' || x=='*' || x=='&' || x=='%' || x=='^' || x=='(' || x==')' || x=='_' || x=='=' || x=='{' || x=='}' || x=='[' || x==']' || x==':' || x=='<' || x=='>' || x=='|')
xx=xx+x;
result1=result1+xx;
    }
result1=result1+":";
//result=result+"\n";
}

 Color[][] colors2 = ImageUtil.loadPixelsFromImage(new File(t2.getText().trim()));
Color share2_color = new Color(0, 255, 0);
 if(colors2[0][0].getRGB() != share2_color.getRGB()){
     JOptionPane.showMessageDialog(null,"Incorrect Share 2 file. Please verify.","Invalid share 2 file",3);
//     System.out.println("p2 " + colors2[0][0]);
     return;
}
String result2="";
 for(int i=1;i<colors2.length;i++)
{
for(int j=1;j<colors2[i].length;j++)
{
int a1=colors2[i][j].getRed();
int a2=colors2[i][j].getGreen();
int a3=colors2[i][j].getBlue();
String xx="";
char x=(char) a1;
if(Character.isLetter(x) || Character.isDigit(x) || x==' ' || x=='.' || x==',' || x=='/' || x==';' || x=='"' || x=='+' || x=='-' || x=='?' || x=='#' || x=='!' || x=='@' || x=='$' || x=='*' || x=='&' || x=='%' || x=='^' || x=='(' || x==')' || x=='_' || x=='=' || x=='{' || x=='}' || x=='[' || x==']' || x==':' || x=='<' || x=='>' || x=='|')
xx=xx+x;
x=(char) a2;
if(Character.isLetter(x) || Character.isDigit(x) || x==' ' || x=='.' || x==',' || x=='/' || x==';' || x=='"' || x=='+' || x=='-' || x=='?' || x=='#' || x=='!' || x=='@' || x=='$' || x=='*' || x=='&' || x=='%' || x=='^' || x=='(' || x==')' || x=='_' || x=='=' || x=='{' || x=='}' || x=='[' || x==']' || x==':' || x=='<' || x=='>' || x=='|')
xx=xx+x;
x=(char) a3;
if(Character.isLetter(x) || Character.isDigit(x) || x==' ' || x=='.' || x==',' || x=='/' || x==';' || x=='"' || x=='+' || x=='-' || x=='?' || x=='#' || x=='!' || x=='@' || x=='$' || x=='*' || x=='&' || x=='%' || x=='^' || x=='(' || x==')' || x=='_' || x=='=' || x=='{' || x=='}' || x=='[' || x==']' || x==':' || x=='<' || x=='>' || x=='|')
xx=xx+x;
result2=result2+xx;
    }
result2=result2+":";
//result=result+"\n";
}

 Color[][] colors3 = ImageUtil.loadPixelsFromImage(new File(t3.getText().trim()));
// Share 3 has first pixel value BLUE = rgb(0, 0, 255)
Color share3_color = new Color(0, 0, 255);
 if(colors3[0][0].getRGB() != share3_color.getRGB()){
     JOptionPane.showMessageDialog(null,"Incorrect Share 3 file. Please verify.","Invalid share 3 file",3);
//     System.out.println("p3 " + colors3[0][0]);
//     return;
}
String result3="";
 for(int i=1;i<colors3.length;i++)
{
for(int j=1;j<colors3[i].length;j++)
{
int a1=colors3[i][j].getRed();
int a2=colors3[i][j].getGreen();
int a3=colors3[i][j].getBlue();
String xx="";
char x=(char) a1;
if(Character.isLetter(x) || Character.isDigit(x) || x==' ' || x=='.' || x==',' || x=='/' || x==';' || x=='"' || x=='+' || x=='-' || x=='?' || x=='#' || x=='!' || x=='@' || x=='$' || x=='*' || x=='&' || x=='%' || x=='^' || x=='(' || x==')' || x=='_' || x=='=' || x=='{' || x=='}' || x=='[' || x==']' || x==':' || x=='<' || x=='>' || x=='|')
xx=xx+x;
x=(char) a2;
if(Character.isLetter(x) || Character.isDigit(x) || x==' ' || x=='.' || x==',' || x=='/' || x==';' || x=='"' || x=='+' || x=='-' || x=='?' || x=='#' || x=='!' || x=='@' || x=='$' || x=='*' || x=='&' || x=='%' || x=='^' || x=='(' || x==')' || x=='_' || x=='=' || x=='{' || x=='}' || x=='[' || x==']' || x==':' || x=='<' || x=='>' || x=='|')
xx=xx+x;
x=(char) a3;
if(Character.isLetter(x) || Character.isDigit(x) || x==' ' || x=='.' || x==',' || x=='/' || x==';' || x=='"' || x=='+' || x=='-' || x=='?' || x=='#' || x=='!' || x=='@' || x=='$' || x=='*' || x=='&' || x=='%' || x=='^' || x=='(' || x==')' || x=='_' || x=='=' || x=='{' || x=='}' || x=='[' || x==']' || x==':' || x=='<' || x=='>' || x=='|')
xx=xx+x;
result3=result3+xx;
    }
result3=result3+":";
//result=result+"\n";
}



StringTokenizer st1=new StringTokenizer(result1,":");
StringTokenizer st2=new StringTokenizer(result2,":");
StringTokenizer st3=new StringTokenizer(result3,":");
String res[]=new String[1000];
int i=0;
while(st1.hasMoreTokens())
{
String pp=st1.nextToken();
if(pp.length()>0)
{
res[i]=new String(pp);
i=i+3;
}
}

 i=1;
while(st2.hasMoreTokens())
{
String pp=st2.nextToken();
if(pp.length()>0)
{
res[i]=new String(pp);
i=i+3;
}
}

 i=2;
while(st3.hasMoreTokens())
{
String pp=st3.nextToken();
if(pp.length()>0)
{
res[i]=new String(pp);
i=i+3;
}
}
String resultme="res";
for(i=1;i<=6;i++)
{
resultme=resultme+(int)(Math.random()*2342%10);
}
resultme=resultme+".txt";
PrintWriter br11=new PrintWriter(new FileWriter(resultme));
l6.setText(resultme);
ta1.setText("");
for( i=0;i<res.length;i++)
{
if(res[i]!=null)
{
br11.println(res[i]);
ta1.setText(ta1.getText()+"\n"+res[i]+"\n");
}
}
br11.close();
}catch(Exception ee){}

}});

l4.setBounds(0,0,900,30);
l4.setFont(new Font("Courier",Font.BOLD,32));


l1.setBounds(20,100,200,30);
t1.setBounds(50,150,200,30);
b1.setBounds(75,200,150,30);


l2.setBounds(320,100,200,30);
t2.setBounds(350,150,200,30);
b2.setBounds(375,200,150,30);

l3.setBounds(620,100,200,30);
t3.setBounds(650,150,200,30);
b3.setBounds(675,200,150,30);

b4.setBounds(350,300,200,30);
ta1=new JTextArea(20,60);
JScrollPane jsp1=new JScrollPane(ta1);
jsp1.setBounds(20,375,860,200);
l5.setBounds(200,350,200,30);
l6.setBounds(375,350,200,30);
d.add(l1);
d.add(l2);
d.add(l3);
d.add(t1);
d.add(t2);
d.add(t3);
d.add(b1);
d.add(b2);
d.add(b3);
d.add(b4);
d.add(jsp1);
d.add(l4);
d.add(l5);
d.add(l6);

addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent tt){
dispose();
}});
setSize(900,600);
setVisible(true);
}
public static void main(String[] args) throws IOException {
final long startTime = System.currentTimeMillis( );
        new Test3();
final long duration = System.currentTimeMillis( ) - startTime;
	System.out.println(duration);
    
}
}
class ImageUtil {

    public static Color[][] loadPixelsFromImage(File file) throws IOException {

        BufferedImage image = ImageIO.read(file);
        Color[][] colors = new Color[image.getWidth()][image.getHeight()];

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                colors[x][y] = new Color(image.getRGB(x, y));
            }
        }

        return colors;
    }
}
