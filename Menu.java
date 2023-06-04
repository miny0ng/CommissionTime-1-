import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class Menu extends JFrame {
	
	private Image img_logo = new ImageIcon(LoginForm.class.getResource("res/LOGO.png")).getImage().getScaledInstance(127,121, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	
	private PanelHome panelHome;
	private PanelProgress panelProgress;
	private PanelPortfolio panelPortfolio;
	private PanelForm panelForm;
	private PanelAbout panelAbout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setUndecorated(true);
		setBackground(new Color(143, 188, 143));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 527);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new LineBorder(new Color(143, 188, 143), 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelHome = new PanelHome();
		panelHome.setBounds(10, 0, 735, 540);
		panelHome.setBackground(new Color(25, 25, 112));
		panelProgress = new PanelProgress();
		panelPortfolio = new PanelPortfolio();
		panelForm = new PanelForm();
		panelAbout = new PanelAbout();
		
		
		
		JLabel lblLOGO = new JLabel("");
		lblLOGO.setBounds(33, 11, 737, 121);
		contentPane.add(lblLOGO);
		lblLOGO.setIcon(new ImageIcon(img_logo));
		lblLOGO.setName("lblLogo");
		lblLOGO.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(143, 188, 143));
		panel.setBounds(0, 0, 780, 66);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelHome = new JPanel();
		panelHome.setBackground(new Color(143, 188, 143));
		panelHome.setBounds(10, 39, 71, 27);
		panel.add(panelHome);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Objective", Font.PLAIN, 13));
		panelHome.add(lblNewLabel);
		
		JPanel panelProgress = new JPanel();
		panelProgress.setBackground(new Color(143, 188, 143));
		panelProgress.setBounds(91, 39, 95, 27);
		panel.add(panelProgress);
		
		JLabel lblNewLabel_1 = new JLabel("PROGRESS");
		lblNewLabel_1.setFont(new Font("Objective", Font.PLAIN, 13));
		panelProgress.add(lblNewLabel_1);
		
		JPanel panelPortfolio = new JPanel();
		panelPortfolio.setBackground(new Color(143, 188, 143));
		panelPortfolio.setBounds(196, 39, 95, 27);
		panel.add(panelPortfolio);
		
		JLabel lblNewLabel_2 = new JLabel("PORTFOLIO");
		lblNewLabel_2.setFont(new Font("Objective", Font.PLAIN, 13));
		panelPortfolio.add(lblNewLabel_2);
		
		JPanel panelForm = new JPanel();
		panelForm.setBackground(new Color(143, 188, 143));
		panelForm.setBounds(521, 39, 71, 27);
		panel.add(panelForm);
		
		JLabel lblNewLabel_3 = new JLabel("FORM");
		lblNewLabel_3.setFont(new Font("Objective", Font.PLAIN, 13));
		panelForm.add(lblNewLabel_3);
		
		JPanel panelAbout = new JPanel();
		panelAbout.setBackground(new Color(143, 188, 143));
		panelAbout.setBounds(602, 39, 71, 27);
		panel.add(panelAbout);
		
		JLabel lblNewLabel_4 = new JLabel("ABOUT");
		lblNewLabel_4.setFont(new Font("Objective", Font.PLAIN, 13));
		panelAbout.add(lblNewLabel_4);
		
		JPanel panelLogout = new JPanel();
		panelLogout.setBackground(new Color(143, 188, 143));
		panelLogout.setBounds(683, 39, 87, 27);
		panel.add(panelLogout);
		
		JLabel lblNewLabel_5 = new JLabel("LOG OUT");
		lblNewLabel_5.setFont(new Font("Objective", Font.PLAIN, 13));
		panelLogout.add(lblNewLabel_5);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(714, 11, 56, 14);
		panel.add(lblX);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					Menu.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}
			@Override
		public void mouseExited(MouseEvent e) {
			lblX.setForeground(Color.WHITE);
			}
		});
		lblX.setForeground(new Color(85, 107, 47));
		lblX.setHorizontalAlignment(SwingConstants.RIGHT);
		lblX.setFont(new Font("Objective", Font.PLAIN, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(10, 77, 760, 439);
		contentPane.add(panel_1);	
		
	}
	}	
	


		

	

