package CongNhanVaKiSu;

public class CongNhan extends NguoiDiLam {

    public CongNhan(String name, String address, int salary, int id, String phoneNumber, int workingDay) {
        super(name, address, salary, id, phoneNumber, workingDay);
    }

    @Override
    public double totalSalary() {
        return this.getSalary() * this.getWorkingDay();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
