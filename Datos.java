import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Datos extends JDialog implements ActionListener,WindowListener	
{
		JButton aboutShow=new JButton("Cerrar");
		public Datos(Login slg, boolean modal)
		{
			 super(slg,modal);
			 JPanel panelDialogo=new JPanel();
			 add(panelDialogo);
			 panelDialogo.setLayout(null);
			 JLabel myName=new JLabel("Andrea Lucrecia Mendoza Ramos");
			 JLabel myId=new JLabel("302545811");
			 panelDialogo.add(myName);
			 panelDialogo.add(myId);
			 Color cl0=new Color(46,51,73);
		   	 Color cl1=new Color(105,77,117);
			 myName.setBounds(325,75,500,50);
			 myName.setForeground(new Color(27,82,153));
			 Font fuente=new Font("arial",1,30);
			 myName.setFont(fuente);
			 myId.setBounds(325,105,400,50);
			 myId.setForeground(new Color(27,82,153));
			 myId.setFont(fuente);
			 aboutShow.setBackground(cl1);
			 aboutShow.setBounds(500,200,150,50);
			 aboutShow.setFont(fuente);
			 panelDialogo.add(aboutShow);
			 aboutShow.addActionListener(this);
			 eventoAbout envAbout=new eventoAbout();
		   	 aboutShow.addKeyListener(envAbout);
			 addWindowListener(this);
			 panelDialogo.setBackground(cl0);
		     setBounds(200,200,850,310);
		     setTitle("Mensaje");
		     Dibujo imp=new Dibujo();
		   	 panelDialogo.add(imp);
		     setResizable(false);
		     setVisible(false);
		}
		public void actionPerformed(ActionEvent e)
		{
		   this.dispose();
		   /*Object bpla=e.getSource();
		   if(bpla==b2)
		   {
		      System.out.println("Pulsado boton No .....");
			   this.dispose();
		   }else if(bpla==bs)
		   {
		       System.out.println("Dijo si -------");
			   this.dispose();
		   }*/
		}
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Close dialog @nw.....");
		}
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Close dialog(closing).....");
		}
		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub	
		}
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Open window.....");
		}
		class eventoAbout implements KeyListener
	   	{
	   		public void keyPressed(KeyEvent t)
	   		{
	   			int cod=t.getKeyCode();
	   			if(cod==10)
	   			{
	   				System.out.println("Cerrar....[enter]");
	   				dispose();
	   			}
	   		}
	   		public void keyReleased(KeyEvent t){}
	   		public void keyTyped(KeyEvent t){}
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
	   			ImageIcon Imr=new ImageIcon(getClass().getResource("errormsg.png"));
	   			grafico.drawImage(Imr.getImage(),0,0,height.width,height.height,null);
	   			setOpaque(false);
	   			super.paintComponent(grafico);
	   		}
	   	}
}
