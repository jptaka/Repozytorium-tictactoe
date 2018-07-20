import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class tictactoe extends JFrame implements ActionListener, MouseListener{
	int kolejka=0;
	JButton przycisk;
	
	ImageIcon icon = new ImageIcon("C:\\Users\\tom\\Desktop\\O.png");
	ImageIcon krzyzyk = new ImageIcon("C:\\Users\\tom\\Desktop\\x.png");
	
	public tictactoe() {
		setSize(800,800);
		setTitle("Kó³ko i krzy¿yk");
		setLayout(new GridLayout(3, 3));
		for(int i=1; i<=9;i++) {
			przycisk=new JButton();
			add(przycisk);
			przycisk.setBackground(Color.WHITE);
			przycisk.addMouseListener(this);
//			przycisk.addActionListener(this);
			
		}
		
	}
	
	public static void main(String[]args)
	{
		tictactoe ramka = new tictactoe();
		ramka.setVisible(true);
		ramka.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
//	public void actionPerformed(ActionEvent e) {
//		przycisk=(JButton) e.getSource();
//		if(kolejka %2 == 0)
//		{
//			przycisk.setIcon(icon);
//		}
//		else
//		{
//			przycisk.setIcon(krzyzyk);
//		}
//		przycisk.setEnabled(false);
//		kolejka++;
//	}

	
	public void mouseClicked(MouseEvent e) {
		przycisk=(JButton) e.getSource();
		if(kolejka %2 == 0)
		{
			przycisk.setIcon(icon);
		}
		else
		{
			przycisk.setIcon(krzyzyk);
		}
		przycisk.setEnabled(false);
		kolejka++;
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		przycisk=(JButton) e.getSource();
		przycisk.setBackground(Color.darkGray);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		przycisk=(JButton) e.getSource();
		przycisk.setBackground(Color.WHITE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
