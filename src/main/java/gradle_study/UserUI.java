package gradle_study;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import gradle_study.ui.DepartmentUI;
import gradle_study.ui.TitleUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnDepartment;
	private JButton btnTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserUI frame = new UserUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("UserUI");
		lblTitle.setFont(new Font("굴림", Font.PLAIN, 30));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle, BorderLayout.CENTER);
		
		JPanel pbtn = new JPanel();
		contentPane.add(pbtn, BorderLayout.SOUTH);
		
		btnDepartment = new JButton("부서");
		btnDepartment.addActionListener(this);
		
		pbtn.add(btnDepartment);
		
		btnTitle = new JButton("직책");
		btnTitle.addActionListener(this);
		
		pbtn.add(btnTitle);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnTitle) {
			actionPerformedBtnTitle(e);
		}
		if (e.getSource() == btnDepartment) {
			actionPerformedBtnDepartment(e);
		}
	}
	protected void actionPerformedBtnDepartment(ActionEvent e) {
		
		DepartmentUI frame = new DepartmentUI(); // 디팔트맨트로 만들어진거를 이렇게 부칠수 있다
		frame.setVisible(true);  
	}
	protected void actionPerformedBtnTitle(ActionEvent e) {
		
		
		TitleUI frame = new TitleUI();
		frame.setVisible(true);
	}
}
