package Quanlynhanvien;

public interface QuanLy<T> {
    void them(T t);
    void sua(String name, T t);
    void xoa(int id);
    int timKiem(String name);
    void sapXep();
    void print();


}
