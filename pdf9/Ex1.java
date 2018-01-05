package br.com.fatec;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Ex1 extends JPanel {

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		for (int i = 0; i < 15; i++) {
			g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 20, 50 + i * 10);
		}
	}
}