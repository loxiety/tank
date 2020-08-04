package com.mashibing.tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {

	public TankFrame() {
		setSize(800, 600);
		setVisible(true);
		this.setResizable(false);
		setTitle("tank war");
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
			
		});
	}

	@Override
	public void paint(Graphics g) {
		g.fillRect(200, 200, 200, 200);
	}
	
	
}
