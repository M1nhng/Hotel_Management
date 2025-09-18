import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
	public App() {
		this.setSize(1400, 850);
		this.setTitle("Hotel Management");
		this.setLocationRelativeTo(null);
		
		GridLayout flowLayout = new GridLayout(1, 1, 4, 4);
		this.setLayout(flowLayout);
		
		JButton jButton1 = new JButton("Đặt Phòng");
		JButton jButton2 = new JButton("Trả Phòng");
		this.add(jButton1);
		this.add(jButton2);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
    public static void main(String[] args) {
        new App();
    }
}
