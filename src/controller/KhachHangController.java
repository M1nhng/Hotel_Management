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
      
    }
}

public class PhongController {
    private PhongView view;
    private List<Phong> danhSachPhong;

    public PhongController(PhongView view) {
        this.view = view;
        this.danhSachPhong = new ArrayList<>();
       
    }
}
