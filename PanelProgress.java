import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.Font;

public class PanelProgress extends JPanel {
	
	private Image img_logo = new ImageIcon(LoginForm.class.getResource("res/LOGO.png")).getImage().getScaledInstance(127,121, Image.SCALE_SMOOTH);
	private JLabel lblReceived;


	/**
	 * Create the panel.
	 */
	public PanelProgress() {
		setBackground(new Color(255, 228, 225));
		setBounds(10, 77, 760, 439);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My commissions");
		lblNewLabel.setForeground(new Color(205, 92, 92));
		lblNewLabel.setFont(new Font("Catline", Font.PLAIN, 25));
		lblNewLabel.setBounds(43, 23, 337, 39);
		add(lblNewLabel);
		
		JPanel panelApproval = new JPanel();
		panelApproval.setBackground(new Color(255, 228, 225));
		panelApproval.setBounds(43, 133, 113, 24);
		add(panelApproval);
		
		JLabel lblApproval = new JLabel("Art Approval");
		lblApproval.setFont(new Font("Objective", Font.PLAIN, 13));
		panelApproval.add(lblApproval);
		
		JPanel panelWIP = new JPanel();
		panelWIP.setBackground(new Color(255, 228, 225));
		panelWIP.setBounds(166, 133, 133, 24);
		add(panelWIP);
		
		JLabel lblWIP = new JLabel("Work in Progress");
		lblWIP.setFont(new Font("Objective", Font.PLAIN, 13));
		panelWIP.add(lblWIP);
		
		JPanel panelCompleted = new JPanel();
		panelCompleted.setBackground(new Color(255, 228, 225));
		panelCompleted.setBounds(309, 133, 97, 24);
		add(panelCompleted);
		
		JLabel lblCompleted = new JLabel("Completed");
		lblCompleted.setFont(new Font("Objective", Font.PLAIN, 13));
		panelCompleted.add(lblCompleted);
		
		JPanel panelArtReceived = new JPanel();
		panelArtReceived.setBackground(new Color(255, 228, 225));
		panelArtReceived.setBounds(416, 133, 97, 24);
		add(panelArtReceived);
		
		lblReceived = new JLabel("Received");
		lblReceived.setHorizontalAlignment(SwingConstants.TRAILING);
		lblReceived.setFont(new Font("Objective", Font.PLAIN, 13));
		panelArtReceived.add(lblReceived);
		
		JPanel panelCancelled = new JPanel();
		panelCancelled.setBackground(new Color(255, 228, 225));
		panelCancelled.setBounds(523, 133, 97, 24);
		add(panelCancelled);
		
		JLabel lblCancelled = new JLabel("Cancelled");
		lblCancelled.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCancelled.setFont(new Font("Objective", Font.PLAIN, 13));
		panelCancelled.add(lblCancelled);
		
		JPanel panelReturn = new JPanel();
		panelReturn.setBackground(new Color(255, 228, 225));
		panelReturn.setBounds(630, 133, 81, 24);
		add(panelReturn);
		
		JLabel lblReturn = new JLabel("Return");
		lblReturn.setHorizontalAlignment(SwingConstants.TRAILING);
		lblReturn.setFont(new Font("Objective", Font.PLAIN, 13));
		panelReturn.add(lblReturn);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(43, 168, 668, 260);
		add(panel);


	}
}
