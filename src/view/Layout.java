package view;
import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {
	public Layout() {
		this.setSize(1400, 850);
		this.setTitle("Hotel Management");
		this.setLocationRelativeTo(null);
		
		JPanel jPanel_button = new JPanel();
		jPanel_button.setLayout(new FlowLayout());
		JButton jButton1 = new JButton("Đặt Phòng");
		JButton jButton2 = new JButton("Trả Phòng");
		jPanel_button.add(jButton1);
		jPanel_button.add(jButton2);
		
		this.add(jPanel_button, BorderLayout.WEST);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
