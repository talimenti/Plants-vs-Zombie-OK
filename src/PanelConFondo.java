import java.awt.*;

import javax.swing.*;


public class PanelConFondo extends JPanel{
	//ATRIBUTOS DE INSTANCIA
	protected JLabel fondo;
	
	//CONSTRUCTOR
<<<<<<< .mine
	public PanelConFondo(){
		//this.setSize(800,600);
		this.setOpaque(true);
		this.setLayout(null);
		
		fondo=new JLabel();
		fondo.setIcon(new ImageIcon("C:/Users/Traian/Downloads/images.jpg"));
		fondo.setBounds(0,0,800,600);
		
		this.add(fondo);
		
=======
	public PanelConFondo(String dir){/*
		fondo=new JLabel();
		fondo.setIcon(new ImageIcon("C:/Users/User/Desktop/campo.jpg"));
		fondo.setBounds(0,0,800,600);
		this.add(fondo);*/
		super();
		imagen=new ImageIcon(dir).getImage();
>>>>>>> .r45
	}
	public void paint(Graphics g){
		super.paint(g);
		g.drawImage(imagen,0, 0, 800, 600,this);
		
		
	}

}
