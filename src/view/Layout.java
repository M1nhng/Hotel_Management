package view;

import javax.swing.*;

public class Layout extends JFrame {
    private JMenuBar menuBar;
    private JPanel mainPanel;

    public Layout() {
        setTitle("Quản lý khách sạn");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mainPanel = new JPanel();
        add(mainPanel);
    }
}

public class KhachHangView extends JPanel {
    private JTable tableKhachHang;
    private JButton btnThem, btnSua, btnXoa;

    public KhachHangView() {
        initUI();
    }

    private void initUI() {
        // layout, button, table
    }
}

public class PhongView extends JPanel {
    private JTable tablePhong;
    private JButton btnThem, btnSua, btnXoa;

    public PhongView() {
        initUI();
    }

    private void initUI() {
        // layout, button, table
    }
}
