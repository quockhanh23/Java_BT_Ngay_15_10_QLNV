package Quanlynhanvien;

public class QuanLyNhanVien implements QuanLy<NhanVien> {
    private NhanVien[] danhSachNhanVien = new NhanVien[5];
    private int size = 0;

    @Override
    public void them(NhanVien nhanVien) {
        danhSachNhanVien[size] = nhanVien;
        size++;
    }

    @Override
    public void sua(int id, NhanVien nhanVien) {
        danhSachNhanVien[timKiem(id)] = nhanVien;
    }

    @Override
    public void xoa(int id) {

        NhanVien[] xoaDanhSach1 = new NhanVien[danhSachNhanVien.length - 1];
        for (int i = 0; i < timKiem(id); i++) {
            xoaDanhSach1[i] = danhSachNhanVien[i];
        }
        for (int i = timKiem(id) + 1; i < danhSachNhanVien.length; i++) {
            xoaDanhSach1[i - 1] = danhSachNhanVien[i];
        }
        for (int i = 0; i < xoaDanhSach1.length; i++) {
            System.out.println(xoaDanhSach1[i]);
        }

    }

    @Override
    public int timKiem(int id) {

        for (int i = 0; i < size; i++) {
            if (id == danhSachNhanVien[i].getId()) {
                return i;

            }
        }
        return -1;
    }

    @Override
    public void sapXep() {

    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSachNhanVien[i]);
        }
    }

    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien(1, "khánh1", 11, 1);
        NhanVien nv2 = new NhanVien(2, "khánh2", 12, 1);
        NhanVien nv3 = new NhanVien(3, "khánh3", 13, 1);
        NhanVien nv4 = new NhanVien(4, "khánh4", 15, 1);
        NhanVien nv5 = new NhanVien(5, "khánh5", 23, 1000);
        ql.them(nv1);
        ql.them(nv2);
        ql.them(nv3);
        ql.them(nv4);
        ql.them(nv5);
        ql.print();
        NhanVien nv6 = new NhanVien(6, "khánh6", 16, 10);
        ql.sua(ql.timKiem(3),nv6 );
        ql.print();
        System.out.println(ql.timKiem(3));

        ql.xoa(5);

    }
}
