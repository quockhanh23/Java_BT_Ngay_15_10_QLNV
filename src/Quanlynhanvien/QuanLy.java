package Quanlynhanvien;

public interface QuanLy<T> {
    void them(T t);
    void sua(int id, T t);
    void xoa(int id);
    int timKiem(int id);
    void sapXep();
    void print();


}
