package br.com.fatec;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Ex2 extends JFrame implements ActionListener {
	private JButton igual, clear, soma, subtrai, multiplica, divide, n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
	private int resultado = 0;
	@SuppressWarnings("unused")
	private JLabel lresultado, espaco;
	private int count = 0;
	private String num = "";
	private int iNum;
	private int[] vetor = new int[3];

	public Ex2() {
		Container c = getContentPane();
		/*
		 Atributos do GridLayout
		 linha
		 coluna
		 espaço horizontal
		 espaço vertical
		 */
		c.setLayout(new GridLayout(5, 0, 5, 5));
		//cria label para resutado ser impresso
		lresultado = new JLabel("" + resultado);
		//Adição dos botões e do label no container
		c.add(lresultado);
		c.add(espaco = new JLabel());
		c.add(clear = new JButton("C"));
		c.add(divide = new JButton("/"));
		c.add(n1 = new JButton("1"));
		c.add(n2 = new JButton("2"));
		c.add(n3 = new JButton("3"));
		c.add(soma = new JButton("+"));
		c.add(n4 = new JButton("4"));
		c.add(n5 = new JButton("5"));
		c.add(n6 = new JButton("6"));
		c.add(subtrai = new JButton("-"));
		c.add(n7 = new JButton("7"));
		c.add(n8 = new JButton("8"));
		c.add(n9 = new JButton("9"));
		c.add(multiplica = new JButton("*"));
		c.add(espaco = new JLabel());
		c.add(n0 = new JButton("0"));
		c.add(espaco = new JLabel());
		c.add(igual = new JButton("="));
		//muda fontes dos botões
		clear.setFont(new Font("Arial", Font.PLAIN, 20));
		lresultado.setFont(new Font("Arial", Font.PLAIN, 30));
		soma.setFont(new Font("Arial", Font.PLAIN, 30));
		divide.setFont(new Font("Arial", Font.PLAIN, 30));
		multiplica.setFont(new Font("Arial", Font.PLAIN, 30));
		subtrai.setFont(new Font("Arial", Font.PLAIN, 30));
		igual.setFont(new Font("Arial", Font.PLAIN, 30));
		n0.setFont(new Font("Arial", Font.PLAIN, 30));
		n1.setFont(new Font("Arial", Font.PLAIN, 30));
		n2.setFont(new Font("Arial", Font.PLAIN, 30));
		n3.setFont(new Font("Arial", Font.PLAIN, 30));
		n4.setFont(new Font("Arial", Font.PLAIN, 30));
		n5.setFont(new Font("Arial", Font.PLAIN, 30));
		n6.setFont(new Font("Arial", Font.PLAIN, 30));
		n7.setFont(new Font("Arial", Font.PLAIN, 30));
		n8.setFont(new Font("Arial", Font.PLAIN, 30));
		n9.setFont(new Font("Arial", Font.PLAIN, 30));
		//Adiciona escuta para quando os botões forem clicados
		clear.addActionListener(this);
		igual.addActionListener(this);
		soma.addActionListener(this);
		subtrai.addActionListener(this);
		multiplica.addActionListener(this);
		divide.addActionListener(this);
		n0.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
		n3.addActionListener(this);
		n4.addActionListener(this);
		n5.addActionListener(this);
		n6.addActionListener(this);
		n7.addActionListener(this);
		n8.addActionListener(this);
		n9.addActionListener(this);
		//Cria tela 
		JFrame tela = new JFrame("Ex2");
		//Adiciona container na tela
		tela.getContentPane().add(c);
		//Tamanho da tela
		tela.setSize(265, 350);
		//Deixa tela visível
		tela.setVisible(true);
		//Ao clicar no X a calculadora é encerrada
		tela.setDefaultCloseOperation(3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//String num é concatenada com o número escolhido
		if (e.getSource() == n0) {
			if (count >= 0) {
				num += "0";
				count++;
			}
		} else if (e.getSource() == n1) {
			if (count >= 0) {
				num += "1";
				count++;
			}
		} else if (e.getSource() == n2) {
			if (count >= 0) {
				num += "2";
				count++;
			}
		} else if (e.getSource() == n3) {
			if (count >= 0) {
				num += "3";
				count++;
			}
		} else if (e.getSource() == n4) {
			if (count >= 0) {
				num += "4";
				count++;
			}
		} else if (e.getSource() == n5) {
			if (count >= 0) {
				num += "5";
				count++;
			}
		} else if (e.getSource() == n6) {
			if (count >= 0) {
				num += "6";
				count++;
			}
		} else if (e.getSource() == n7) {
			if (count >= 0) {
				num += "7";
				count++;
			}
		} else if (e.getSource() == n8) {
			if (count >= 0) {
				num += "8";
				count++;
			}
		} else if (e.getSource() == n9) {
			if (count >= 0) {
				num += "9";
				count++;
			}
		} 
		/*
		 * Verifica se algum número já foi selecionado antes, string num é convertida para int e adicionada na posição 0 do vetor
		 * na posiçao 1 é adicionado o operador de acordo com a tabela ascii
		 * Após isso todos os valores retornam ao padrão
		 */
		else if (e.getSource() == multiplica) {
			if (count >= 1 && vetor[1] == 0) {
				count = 0;
				// 42
				vetor[1] = '*' + 0;
				iNum = Integer.valueOf(num);
				vetor[count] = iNum;
				num = "";
			}
		} else if (e.getSource() == divide) {
			if (count >= 1 && vetor[1] == 0) {
				count = 0;
				// 47
				vetor[1] = '/' + 0;
				iNum = Integer.valueOf(num);
				vetor[count] = iNum;
				num = "";
			}
		} else if (e.getSource() == soma) {
			if (count >= 1 && vetor[1] == 0) {
				count = 0;
				// 43
				vetor[1] = '+' + 0;
				iNum = Integer.valueOf(num);
				vetor[count] = iNum;
				num = "";
			}
		} else if (e.getSource() == subtrai) {
			if (count >= 1  && vetor[1] == 0) {
				count = 0;
				// 45
				vetor[1] = '-' + 0;
				iNum = Integer.valueOf(num);
				vetor[count] = iNum;
				num = "";
			}
		} 
		/*
		 * Na posição 2 do vetor o mesmo processo é feito e de acordo com a posição 1 do vetor as operações são realizadas
		 * atribuição no label resultado é feito e impresso na tela
		 * */
		else if (e.getSource() == igual) {
			count = 2;
			vetor[count] = Integer.valueOf(num);
			if (vetor[1] == '*') {
				resultado = vetor[0] * vetor[2];
			} else if (vetor[1] == '/') {
				resultado = vetor[0] / vetor[2];
			} else if (vetor[1] == '+') {
				resultado = vetor[0] + vetor[2];
			} else if (vetor[1] == '-') {
				resultado = vetor[0] - vetor[2];
			}
			vetor[0] = 0;
			vetor[1] = 0;
			vetor[2] = 0;
			count = 0;
			num = "";
		} 
		/*Acão para limpar resultados e zerar todos os valores*/
		else if (e.getSource() == clear) {
			resultado = 0;
			vetor[0] = 0;
			vetor[1] = 0;
			vetor[2] = 0;
			count = 0;
			num = "";
		}
		//Imprime resultado das operações na tela
		lresultado.setText("" + resultado);
	}
}
