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
		JButton jButton_datPhong = new JButton("Đặt Phòng");
		JButton jButton_traPhong = new JButton("Trả Phòng");
		JButton jButton_thongTin = new JButton("Thông Tin");
		JButton jButton_danhSachPhong = new JButton("Danh Sách Phòng");
		
		jPanel_button.add(jButton_datPhong);
		jPanel_button.add(jButton_traPhong);
		jPanel_button.add(jButton_thongTin);
		jPanel_button.add(jButton_danhSachPhong);
		
		JTextField jTextField = new JTextField(30);
//		jTextField.setLayout(new GridLayout(3, 1));
		
		JPanel jPanel_text1 = new JPanel();
//		JPanel jPanel_text2 = new JPanel();
		jPanel_text1.add(jTextField, BorderLayout.WEST);
//		jPanel_text2.add(jTextField, BorderLayout.WEST);
		
		this.add(jPanel_button, BorderLayout.WEST);
		this.add(jPanel_text1, BorderLayout.EAST);
//		this.add(jPanel_text2, BorderLayout.EAST);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
