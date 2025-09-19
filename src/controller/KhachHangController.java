package controller;

import model.*;
import view.*;
import java.awt.event.*;
import java.util.*;

public class KhachHangController {
    private KhachHangView view;
    private List<KhachHang> danhSachKH;

    public KhachHangController(KhachHangView view) {
        this.view = view;
        this.danhSachKH = new ArrayList<>();
        initController();
    }

    private void initController() {
        // lắng nghe button, xử lý sự kiện
    }
}

public class PhongController {
    private PhongView view;
    private List<Phong> danhSachPhong;

    public PhongController(PhongView view) {
        this.view = view;
        this.danhSachPhong = new ArrayList<>();
        initController();
    }

    private void initController() {
        // xử lý sự kiện trong view
    }
}
