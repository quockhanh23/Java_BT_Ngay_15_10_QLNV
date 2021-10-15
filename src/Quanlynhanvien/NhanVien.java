package Quanlynhanvien;

public class NhanVien extends NhanSu {
    private int salary;

    public NhanVien(int id, String name, int age, int salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public NhanVien() {

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{Id " + getId() + ", Tên = " + getName() +
                ", Lương = " + salary +
                '}';
    }
}
