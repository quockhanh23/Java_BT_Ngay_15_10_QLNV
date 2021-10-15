package Quanlynhanvien;

public class QuanLyNhanVien implements QuanLy<NhanVien> {
    private NhanVien[] danhSachNhanVien = new NhanVien[10];
    private int size = 0;

    @Override
    public void them(NhanVien nhanVien) {
        danhSachNhanVien[size] = nhanVien;
        size++;
    }

    @Override
    public void sua(String name, NhanVien nhanVien) {
        danhSachNhanVien[timKiem(name)] = nhanVien;
    }

    @Override
    public void xoa(int id) {

    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name == danhSachNhanVien[i].getName()) {
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
        NhanVien nv4 = new NhanVien(4, "khánh3", 15, 1);
        NhanVien nv5 = new NhanVien(5, "khánh5", 23, 1000);
        ql.them(nv1);
        ql.them(nv2);
        ql.them(nv3);
        ql.them(nv4);

        ql.print();
        NhanVien nv6 = new NhanVien(5, "khánh6", 53, 5000);
        System.out.println(ql.timKiem("khánh2"));
        ql.sua("khánh", nv6);
        ql.print();


    }
}
