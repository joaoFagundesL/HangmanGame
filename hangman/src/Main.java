import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		int[] chances = {4};
		JLabel lblNewLabel = new JLabel("Chances Restantes: ");
		lblNewLabel.setBounds(22, 27, 146, 19);
		frame.getContentPane().add(lblNewLabel);
		
		String s = String.valueOf(chances[0]);
		JLabel labelChances = new JLabel(s);
		 labelChances.setBounds(180, 29, 70, 15);
		frame.getContentPane().add(labelChances);
		
		File file = new File("src/words");
		List<String> palavras = new ArrayList<>();

		try {
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				String p = sc.nextLine();
				palavras.add(p);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
        }
		
		Random rand = new Random();
		String palavraDoJogo = palavras.get(rand.nextInt(palavras.size()));
		int espaco = 129; // Meu espaco inicial
		
		List<JLabel> campos = new ArrayList<>();
		
		for(int i = 0; i < palavraDoJogo.length(); i++) {
			JLabel label = new JLabel("_____");
			label.setBounds(espaco, 128, 53, 19);
			frame.getContentPane().add(label);
			campos.add(label);
			espaco += 50; // Espaco entre os campos aumenta de 50 em 50
		}
		
		JButton letraA = new JButton("A");
		letraA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'A', campos, letraA);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraA.setBounds(22, 373, 71, 19);
		frame.getContentPane().add(letraA);
		
		JButton letraB = new JButton("B");
		letraB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'B', campos, letraB);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraB.setBounds(116, 373, 71, 19);
		frame.getContentPane().add(letraB);
		
		JButton letraC = new JButton("C");
		letraC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'C', campos, letraC);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraC.setBounds(209, 373, 71, 19);
		frame.getContentPane().add(letraC);
		
		JButton letraD = new JButton("D");
		letraD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'D', campos, letraD);
				verificar(0, chances, labelChances);
			}
		});
		letraD.setBounds(306, 373, 71, 19);
		frame.getContentPane().add(letraD);
		
		JButton letraE = new JButton("E");
		letraE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'E', campos, letraE);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraE.setBounds(405, 373, 71, 19);
		frame.getContentPane().add(letraE);
		
		JButton letraF = new JButton("F");
		letraF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'F', campos, letraF);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraF.setBounds(508, 373, 71, 19);
		frame.getContentPane().add(letraF);
		
		JButton letraG = new JButton("G");
		letraG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'G', campos, letraG);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraG.setBounds(610, 373, 71, 19);
		frame.getContentPane().add(letraG);
		
		JButton letraH = new JButton("H");
		letraH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				teste(palavraDoJogo, 'H', campos, letraH);
				verificar(0, chances, labelChances);
			}
		});
		letraH.setBounds(706, 373, 71, 19);
		frame.getContentPane().add(letraH);
		
		JButton letraI = new JButton("I");
		letraI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'I', campos, letraI);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraI.setBounds(22, 411, 71, 19);
		frame.getContentPane().add(letraI);
		
		JButton letraJ = new JButton("J");
		letraJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'J', campos, letraJ);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraJ.setBounds(116, 411, 71, 19);
		frame.getContentPane().add(letraJ);
		
		JButton letraK = new JButton("K");
		letraK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				teste(palavraDoJogo, 'K', campos, letraK);
				verificar(0, chances, labelChances);
			}
		});
		letraK.setBounds(209, 411, 71, 19);
		frame.getContentPane().add(letraK);
		
		JButton letraL = new JButton("L");
		letraL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'L', campos, letraL);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraL.setBounds(306, 411, 71, 19);
		frame.getContentPane().add(letraL);
		
		JButton letraM = new JButton("M");
		letraM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'M', campos, letraM);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraM.setBounds(405, 411, 71, 19);
		frame.getContentPane().add(letraM);
		
		JButton letraN = new JButton("N");
		letraN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'N', campos, letraN);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraN.setBounds(508, 411, 71, 19);
		frame.getContentPane().add(letraN);
		
		JButton letraO = new JButton("O");
		letraO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'O', campos, letraO);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraO.setBounds(610, 411, 71, 19);
		frame.getContentPane().add(letraO);
		
		JButton letraP = new JButton("P");
		letraP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'P', campos, letraP);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraP.setBounds(706, 411, 71, 19);
		frame.getContentPane().add(letraP);
		
		JButton letraQ = new JButton("Q");
		letraQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'Q', campos, letraQ);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraQ.setBounds(22, 452, 71, 19);
		frame.getContentPane().add(letraQ);
		
		JButton letraR = new JButton("R");
		letraR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'R', campos, letraR);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraR.setBounds(116, 452, 71, 19);
		frame.getContentPane().add(letraR);
		
		JButton letraS = new JButton("S");
		letraS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'S', campos, letraS);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraS.setBounds(209, 452, 71, 19);
		frame.getContentPane().add(letraS);
		
		JButton letraT = new JButton("T");
		letraT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'T', campos, letraT);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraT.setBounds(306, 452, 71, 19);
		frame.getContentPane().add(letraT);
		
		JButton letraU = new JButton("U");
		letraU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'U', campos, letraU);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraU.setBounds(405, 452, 71, 19);
		frame.getContentPane().add(letraU);
		
		JButton letraV = new JButton("V");
		letraV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'V', campos, letraV);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraV.setBounds(508, 452, 71, 19);
		frame.getContentPane().add(letraV);
		
		JButton letraW = new JButton("W");
		letraW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'W', campos, letraW);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraW.setBounds(610, 452, 71, 19);
		frame.getContentPane().add(letraW);
		
		JButton letraX = new JButton("X");
		letraX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'X', campos, letraX);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraX.setBounds(706, 452, 71, 19);
		frame.getContentPane().add(letraX);
		
		JButton letraY = new JButton("Y");
		letraY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'Y', campos, letraY);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraY.setBounds(22, 493, 71, 19);
		frame.getContentPane().add(letraY);
		
		JButton letraZ = new JButton("Z");
		letraZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int encontrou = teste(palavraDoJogo, 'Z', campos, letraZ);
				verificar(encontrou, chances, labelChances);
			}
		});
		letraZ.setBounds(116, 493, 71, 19);
		frame.getContentPane().add(letraZ);
		
	}
	
	public void verificar(int encontrou, int[] chances, JLabel labelChances) {
		if(encontrou == 0) {
			if(chances[0] != 0) {
				chances[0] = chances[0] - 1; // Chance diminui conforme ele erra
				labelChances.setText(String.valueOf(chances[0])); // Atualiza na tela a quantidade de chances
			} else { // Se acabou as chances
				JOptionPane.showMessageDialog(null, 
                          "Você Perdeu!", 
                          "Mensagem", 
                          JOptionPane.WARNING_MESSAGE);
				
				mensagem();
			}
		}
		
	}
	
	public int teste(String palavraDoJogo, char letra, List<JLabel> campos, JButton l) {
		int encontrou = 0;
		int cont = 0;
		String s = "_____";
		for(int i = 0; i < palavraDoJogo.length(); i++) {				
			if(Character.toLowerCase(letra) == palavraDoJogo.charAt(i) || 
					Character.toUpperCase(letra) == palavraDoJogo.charAt(i)) {
				campos.get(i).setText(l.getText()); // Caso a palavra tenha a letra informada ele insere na posi
				encontrou++;
			} 
			if(encontrou >= 0 && campos.get(i).getText() != s) { 
				cont++;
			} // Verifica se todos os campos tem caracteres para dizer se ganhou ou nao
		}
		
		if(cont == palavraDoJogo.length()) {
			JOptionPane.showMessageDialog(null, 
                    "Você Ganhou!", 
                    "Mensagem", 
                    JOptionPane.WARNING_MESSAGE);
			
			
			mensagem(); // Mostra a mensagem se o usuario deseja continuar
		}
		
		l.setVisible(false); // Esconde a letra do teclado
		return encontrou;
	}
	public void mensagem() {
		int dialogButton = JOptionPane.YES_NO_OPTION;
		int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Mensagem", dialogButton);
		
		if(dialogResult == 0) {
			//Todo
		}else { 
			System.exit(0);
			frame.dispose();
			frame.setVisible(false);
		} // Usuario saiu do programa
	}
}
