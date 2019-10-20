import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exercice1 extends JFrame {

	private JPanel contentPane;
	public exercice1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnGenieInfo = new JButton("Génie info");
		btnGenieInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "c'est génie informatique","message" ,JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnGenieInfo.setBounds(22, 11, 105, 23);
		contentPane.add(btnGenieInfo);
		
		JButton btnGnieIndustriel = new JButton("Génie industriel");
		btnGnieIndustriel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "c'est génie idustriel","message" ,JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnGnieIndustriel.setBounds(166, 11, 105, 23);
		contentPane.add(btnGnieIndustriel);
		
		JButton btnManagement = new JButton("management");
		btnManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "c'est management","message" ,JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnManagement.setBounds(307, 11, 95, 23);
		contentPane.add(btnManagement);
		
		JButton btnControleDeQualit = new JButton("controle de qualité");
		btnControleDeQualit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "c'est controle de qualité","message" ,JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnControleDeQualit.setBounds(146, 45, 143, 23);
		contentPane.add(btnControleDeQualit);
	}
	public static void main(String[] args) {
					exercice1 frame = new exercice1();
					frame.setVisible(true);
	}
}
