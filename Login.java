import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
public class Login extends JFrame implements ActionListener
{
   	public static JPanel pan12,pan;
   	public static JPanel panData;
   	public static JButton btnClose=new JButton("Cerrar");
   	public static JButton btnLogin=new JButton("Login");
   	public static JButton btnAbout=new JButton("About");
   	public static JButton btnBack=new JButton("Regresar");
   	public static JLabel lbn=new JLabel("USUARIO");
   	public static JLabel lbp=new JLabel("CONTRASEÑA");
   	public static JTextField txtn;
   	public static JPasswordField ps;
   	int numLogin;
   	int numAbout;
   	public static String name="julio";
   	public static String ape="ordoñez";
   	public static String id="200915712";
    public static JLabel ld=new JLabel(name+" "+ape+" - "+id);
   	Login()
   	{
   		setBounds(100,100,1100,600);
   		setTitle("Datos");
   		URL ruta=Login.class.getResource("balon.png");
   		Toolkit bag=Toolkit.getDefaultToolkit();
   		Image img=bag.getImage(ruta);
   		setIconImage(img);
   		pan=new JPanel();
   		//Color cl0=new Color(46,51,73);
   		Color cl0=new Color(122,132,80);
   		//Color cl1=new Color(105,77,117);
   		Color cl1=new Color(139,149,201);
   		Font fuente=new Font("arial",1,30);
   		ld.setBounds(30,30,800,50);
   		ld.setFont(fuente);
   		ld.setBackground(new Color(172,215,236));
   		txtn=new JTextField();
   		//txtn.setBounds(20,250,260,50);
   		txtn.setBounds(300,80,260,50);
   		txtn.setFont(fuente);
   		txtn.setBackground(new Color(172,215,236));
   		//txtn.requestFocus();
   		pan.add(txtn);
   		pan.setLayout(null);
   		pan.setBackground(cl0);
   		panData=new JPanel();
   		panData.setLayout(null);
   		panData.setBackground(cl0);
   		//panLogin.setVisible(false);
   		//add(panLogin);
   		btnClose.setBounds(300,320,260,50);
   		btnClose.setFont(fuente);
   		btnClose.setBackground(cl1);
   		pan.add(btnClose);
   		btnClose.addActionListener(this);
   		lbn.setBounds(300,30,260,50);
   		lbn.setFont(fuente);
   		pan.add(lbn);
   		lbp.setBounds(300,130,260,50);
   		lbp.setFont(fuente);
   		pan.add(lbp);
   		ps=new JPasswordField();
   		ps.setBounds(300,180,260,50);
   		ps.setFont(fuente);
   		ps.setBackground(new Color(172,215,236));
   		pan.add(ps);
   		btnLogin.setBounds(300,250,260,50);
   		//Font fuente=new Font("arial",1,30);
   		btnLogin.setFont(fuente);
   		pan.add(btnLogin);
   		btnLogin.setBackground(cl1);
   		btnLogin.addActionListener(this);
   		focusLogin fcsLogin=new focusLogin();
   		btnLogin.addFocusListener(fcsLogin);
   		eventoLogin envLogin=new eventoLogin();
   		btnLogin.addKeyListener(envLogin);
   		btnAbout.setBackground(cl1);
   		btnAbout.setBounds(600,200,150,50);
   		btnAbout.setFont(fuente);
   		//pan.add(btnAbout);
   		btnAbout.addActionListener(this);
   		focusAbout fcsAbout=new focusAbout();
   		btnAbout.addFocusListener(fcsAbout);
   		eventoAbout envAbout=new eventoAbout();
   		btnAbout.addKeyListener(envAbout);
   		btnBack.setBounds(600,100,150,50);
   		btnBack.setFont(fuente);
   		//panData.add(btnBack);
   		btnBack.setBackground(cl1);
   		btnBack.addActionListener(this);
   		Dibujo imp=new Dibujo();
   		pan.add(imp);
   		//add(panLogin);
   		add(pan);
   		//add(panData);
   		panData.setVisible(false);
   		setVisible(true);
   		setResizable(false);
   		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	}
   	public void actionPerformed(ActionEvent m)
   	{
   		Object btnClick=m.getSource();
   		if(btnClick==btnLogin)
   		{
   			System.out.println("Login......");
   			if(txtn.getText().equals(name)&&ps.getText().equals(id))
   			{
		       System.out.println("hola......");
   		       pan.setVisible(false);
   		       panData.add(ld);
   		       panData.add(btnClose);
   		       add(panData);
   		       panData.setVisible(true);
		    }
   		}
   	    if(btnClick==btnAbout)
   		{
   			System.out.println("About<<<<<<");
   			Datos aboutShow=new Datos(null, rootPaneCheckingEnabled);
   			aboutShow.setVisible(true);
   		}
   		if(btnClick==btnBack)
   		{
   		   System.out.println("back.....");
   		   pan.setVisible(true);
   		   //panLogin.setVisible(false);
   		   panData.setVisible(false);
   		}
   		if(btnClick==btnClose)
   		{
   		   System.exit(0);
   		}
   	}
   	class focusLogin implements FocusListener
   	{
   		public void focusGained(FocusEvent t)
   		{
   			numLogin=1;
   		}
   		public void focusLost(FocusEvent t)
   		{
   			numLogin=0;
   		}
   	}
   	class eventoLogin implements KeyListener
   	{
   		public void keyPressed(KeyEvent t)
   		{
   			int cod=t.getKeyCode();
   			if(cod==10&&numLogin==1)
   				System.out.println("Login....[enter]");
   			    System.out.println(cod);
   			    pan.setVisible(false);
   			    add(panData);
   			    panData.setVisible(true);
   			    //pan11 p=new pan11();
   			    //add(pan12);
   			    //pan12.setVisible(true);
   		}
   		public void keyReleased(KeyEvent t){}
   		public void keyTyped(KeyEvent t){}
   	}
   	class focusAbout implements FocusListener
   	{
   		public void focusGained(FocusEvent t)
   		{
   			numAbout=1;
   		}
   		public void focusLost(FocusEvent t)
   		{
   			numAbout=0;
   		}
   	}
   	class eventoAbout implements KeyListener
   	{
   		public void keyPressed(KeyEvent t)
   		{
   			int cod=t.getKeyCode();
   			if(cod==10&&numAbout==1)
   			{
   				System.out.println("About....[enter]");
   				Datos aboutShow=new Datos(null, rootPaneCheckingEnabled);
   				aboutShow.setVisible(true);
   			}
   		}
   		public void keyReleased(KeyEvent t){}
   		public void keyTyped(KeyEvent t){}
   	}
   	class pan11 extends javax.swing.JFrame
   	{
   		public pan11()
   		{
   		   setBounds(100,100,1100,600);
   	   	   setTitle("Bancool");
   	   	   URL ruta=Login.class.getResource("balon.png");
   	   	   Toolkit bag=Toolkit.getDefaultToolkit();
   	   	   Image img=bag.getImage(ruta);
   	   	   setIconImage(img);
   		   pan12=new JPanel();
   		   pan12.setLayout(null);
   		   pan12.setBackground(Color.YELLOW);
   		   Dibujo imp=new Dibujo();
   		   pan12.add(imp);
   		   //add(pan12);
   		   setVisible(true);
   		   setResizable(false);
   		   //setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
   		}
   	   /*public void paintComponent(Graphics g)
   	   {
   	   super.paintComponent(g);
   	   Graphics2D du9=(Graphics2D) g;
   	   Font tf9=new Font("Expansiva",Font.BOLD,26);
   	   du9.setFont(tf9);
   	   du9.setColor(new Color(53,94,59));
   	   du9.drawString("Ordenes por zona",9,25);
   	   }*/
   	}
   	class Dibujo extends javax.swing.JPanel
   	{
   		public Dibujo()
   		{
   			this.setBounds(20,20,128,128);
   		}
   		public void paint(Graphics grafico)
   		{
   			Dimension height=getSize();
   			ImageIcon Imr=new ImageIcon(getClass().getResource("keyp.png"));
   			grafico.drawImage(Imr.getImage(),0,0,height.width,height.height,null);
   			setOpaque(false);
   			super.paintComponent(grafico);
   		}
   	}
}
