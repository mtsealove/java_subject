package com.ueue.subject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Hello {
	public static void main(String[] args) {
		Frame F=new Frame("Hello World");
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension size=tk.getScreenSize();
		F.setBounds(size.width/2-200, size.height/2-75, 400, 150);
		F.setLayout(null);
		F.addWindowListener(new justexit());
		
		Label L=new Label("Hello World!", Label.CENTER);
		L.setFont(new Font("D2Coding", Font.PLAIN, 30));
		L.setBounds(0,50, 400, 40);
		F.add(L);
		Button close=new Button("´Ý±â");
		close.setBounds(150, 100, 100, 30);
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				F.setVisible(false);
				F.dispose();
				System.exit(0);
			}
			
		});
		F.add(close);
		System.out.println("Hello World!");
		F.setVisible(true);
	}
}

class justexit implements WindowListener {

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		arg0.getWindow().setVisible(false);
		arg0.getWindow().dispose();
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

