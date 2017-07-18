import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;
public class Test2 extends JFrame
    {
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s;
     ImageIcon img,img1,img2;
     Image image1,image2,image3;
     JPanel p;
     JLabel label,label1,label2;
     JLabel text;
JFileChooser fc=new JFileChooser();
JButton b1,b2,b3;
BufferedImage bimg,bimg1,bimg2;
String filename="";
JLabel l2,l3,l4,l5,l6,l7;
JTextField l1;     
int lineno=0;
public Test2()
         {

         new Font("Serif",Font.BOLD,12);
       


b1=new JButton("SelectFile");
l1=new JTextField(20);
l2=new JLabel("");
l3=new JLabel("");
l4=new JLabel("");
l7=new JLabel("");

b2=new JButton("Encrypt");
b1.addActionListener(new ActionListener(){
private BufferedReader br;

public void actionPerformed(ActionEvent tt){
int kk=fc.showOpenDialog(Test2.this);
if(kk==JFileChooser.APPROVE_OPTION)
{
filename=fc.getSelectedFile().getPath();
l1.setText(filename);
try
{
br = new BufferedReader(new FileReader(filename));
while((br.readLine())!=null)
lineno++;
File temp1=new File(filename);
l7.setText("Size is "+temp1.length()+" Bytes");
}catch(Exception ee){}
}
}});

b3=new JButton("View File");
b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent tt){
mydialog dd=new mydialog(Test2.this,"MyProject",true,l1.getText().trim());
dd.setSize(1100,600);
dd.setVisible(true);
}});
b2.addActionListener(new ActionListener(){
private BufferedReader br;
public void actionPerformed(ActionEvent tt){

	try{	
         MediaTracker mt = new MediaTracker(Test2.this);
         image1 = Toolkit.getDefaultToolkit().createImage("test.jpg");
         mt.addImage(image1,0);
         try{mt.waitForID(0);}catch(InterruptedException ie){}
         image2 = Toolkit.getDefaultToolkit().createImage("test.jpg");
         mt.addImage(image2,1);
         try{mt.waitForID(1);}catch(InterruptedException ie){}
         image3 = Toolkit.getDefaultToolkit().createImage("test.jpg");
         mt.addImage(image3,2);
         try{mt.waitForID(2);}catch(InterruptedException ie){}

         int width = image1.getWidth(null);
         int height = image1.getHeight(null);

	width=(lineno/2)+2;	
	height=((lineno/3)+(lineno%3))*11;
    bimg = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
         bimg.createGraphics().drawImage(image1, 0, 0, Test2.this);

    bimg1 = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
         bimg1.createGraphics().drawImage(image2, 0, 0, Test2.this);

    bimg2 = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
         bimg2.createGraphics().drawImage(image3, 0, 0, Test2.this);

		br = new BufferedReader(new FileReader(filename));
		String ss="";
		int p1=1,q1=1,p2=1,q2=1,p3=1,q3=1;
		int lineno=1;
		while((ss=br.readLine())!=null)
		{
		int count=0;
		int r1=0,r2=0,r3=0;

		if(lineno==1)
		{
		q1=1;
		Color cc=new Color(255,0,0);	
		bimg.setRGB(0,0,cc.getRGB());

		for(int i=0;i<ss.length();i++)
			{
			switch(count)
			{
			case 0:r1=(int)ss.charAt(i);break;
			case 1:r2=(int)ss.charAt(i);break;
			case 2:r3=(int)ss.charAt(i);
		//System.out.println(ss.charAt(i)+" "+p1+" "+q1+" "+r1+" "+r2+" "+r3);
			Color ccc=new Color(r1,r2,r3);
			int rgb=ccc.getRGB();
			bimg.setRGB(p1,q1,rgb);								
			q1++;
			r1=0;
			r2=0;
			r3=0;
			count=-1;
			}
			count++;
			}
		p1++;
		}
		else
		if(lineno==2)
		{
		q2=1;
		Color cc=new Color(0,255,0);	
		bimg1.setRGB(0,0,cc.getRGB());
		for(int i=0;i<ss.length();i++)
			{
			switch(count)
			{
			case 0:r1=(int)ss.charAt(i);break;
			case 1:r2=(int)ss.charAt(i);break;
			case 2:r3=(int)ss.charAt(i);
			Color ccc=new Color(r1,r2,r3);
		//System.out.println(ss.charAt(i)+" "+p2+" "+q2+" "+r1+" "+r2+" "+r3);
		
			int rgb=ccc.getRGB();
			bimg1.setRGB(p2,q2,rgb);							
			r1=0;
			r2=0;
			r3=0;
			q2++;
			count=-1;
			}
			count++;
		
			}
		p2++;
		}
		else
		if(lineno==3)
		{
		q3=1;
		Color cc=new Color(0,0,255);	
		bimg2.setRGB(0,0,cc.getRGB());
		for(int i=0;i<ss.length();i++)
			{
			switch(count)
			{
			case 0:r1=(int)ss.charAt(i);break;
			case 1:r2=(int)ss.charAt(i);break;
			case 2:r3=(int)ss.charAt(i);
			Color ccc=new Color(r1,r2,r3);
			int rgb=ccc.getRGB();
			bimg2.setRGB(p3,q3,rgb);								
			r1=0;
			r2=0;
			r3=0;
			count=-1;
			q3++;
			}
			count++;
		
			}
		lineno=0;
		p3++;
		}

		lineno++;  
		}
	}catch(Exception eee){}
         img = new ImageIcon(bimg);
         img1 = new ImageIcon(bimg1);
         img2 = new ImageIcon(bimg2);
label.setIcon(img);
label1.setIcon(img1);
label2.setIcon(img2);
try{
String fnm=filename.substring(filename.lastIndexOf('\\')+1,filename.lastIndexOf('.'));
String fnm1="",fnm2="",fnm3="";
if(fnm.length()>5)
fnm1=fnm.substring(0,5)+"sh1.png";
else
fnm1=fnm+"sh1.png";

if(fnm.length()>5)
fnm2=fnm.substring(0,5)+"sh2.png";
else
fnm2=fnm+"sh2.png";

if(fnm.length()>5)
fnm3=fnm.substring(0,5)+"sh3.png";
else
fnm3=fnm+"sh3.png";

File file1=new File(fnm1);
ImageIO.write(bimg,"png",file1);
File file2=new File(fnm2);
ImageIO.write(bimg1,"png",file2);
File file3=new File(fnm3);
ImageIO.write(bimg2,"png",file3);
l2.setText(fnm1);
l3.setText(fnm2);
l4.setText(fnm3);

l2.setText(l2.getText()+" Size is "+file1.length()+" Bytes");
l3.setText(l3.getText()+" Size is "+file2.length()+" Bytes");
l4.setText(l4.getText()+" Size is "+file3.length()+" Bytes");

}catch(Exception ee){} 
}});
        label = new JLabel(new ImageIcon("sdfsd"));
         label1 = new JLabel(new ImageIcon("sdfsd"));
         label2 = new JLabel(new ImageIcon("sdfsd"));
    JScrollPane jsp1=new JScrollPane(label);
   JScrollPane jsp2=new JScrollPane(label1);
   JScrollPane jsp3=new JScrollPane(label2);

         p = new JPanel();
  p.setLayout(new GridLayout(3,1,10,10));
JPanel temp1=new JPanel();
temp1.setLayout(new GridLayout(2,1));
temp1.add(l2);
temp1.add(jsp1);

JPanel temp2=new JPanel();
temp2.setLayout(new GridLayout(2,1));
temp2.add(l3);
temp2.add(jsp2);

JPanel temp3=new JPanel();
temp3.setLayout(new GridLayout(2,1));
temp3.add(l4);
temp3.add(jsp3);

               p.add(temp1);
	p.add(temp2);
	p.add(temp3);
JPanel p11=new JPanel();
//p11.setLayout(new GridLayout(2,2));
l6=new JLabel("File Selected Is ->");
p11.add(b1);
p11.add(b2);
l6.setForeground(Color.red);
l6.setFont(new Font("Courier",Font.BOLD,20));
l1.setFont(new Font("Courier",Font.BOLD,20));

p11.add(l6);
p11.add(l1);
p11.add(b3);
p11.add(l7);
l5=new JLabel("Encryption Process",JLabel.CENTER);
l5.setFont(new Font("Courier",Font.BOLD,36));
JPanel p12=new JPanel();
p12.setLayout(new GridLayout(2,1));
p12.add(l5);
p12.add(p11);

         getContentPane().add("North",p12);
         getContentPane().add("Center",p);
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent tt){
dispose();
}});

setSize(1150,600);
setVisible(true);
     }
class mydialog extends JDialog
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JTextArea ta1;
private BufferedReader bbr;
public mydialog(Test2 p,String tit,boolean flag,String filen)
{
super(p,tit,flag);
ta1=new JTextArea(20,40);
ta1.setFont(new Font("Courier",Font.BOLD,20));
JScrollPane jsp1=new JScrollPane(ta1);
add(jsp1);
try
{
bbr = new BufferedReader(new FileReader(filen));
String str1="";
String s1="";
while((s1=bbr.readLine())!=null)
{
str1=str1+s1+"\n";
}
ta1.setText(str1);
}catch(Exception ttt){}

}
}     
public static void main(String args[])
         {
	final long startTime = System.currentTimeMillis( );
         Test2 tt = new Test2();
         tt.setDefaultCloseOperation(EXIT_ON_CLOSE);
         tt.setSize(1150,600);
         tt.setVisible(true);
	final long duration = System.currentTimeMillis( ) - startTime;
	System.out.println(duration);
     }
}
