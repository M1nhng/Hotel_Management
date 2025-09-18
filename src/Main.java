import javax.swing.UIManager;

import view.Layout;


public class Main {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			new Layout();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
