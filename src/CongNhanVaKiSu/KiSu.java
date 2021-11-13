package CongNhanVaKiSu;

public class KiSu extends CongNhan {
    private double hesoLuong = 1.2;

    public KiSu(String name, String address, int salary, int id, String phoneNumber, int workingDay) {
        super(name, address, salary, id, phoneNumber, workingDay);
    }

    public KiSu(String name, String address, int salary, int id, String phoneNumber, int workingDay, double heSoLuong) {
        super(name, address, salary, id, phoneNumber, workingDay);
        this.hesoLuong = heSoLuong;
    }

    public double getHesoLuong() {
        return hesoLuong;
    }

    public void setHesoLuong(double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }

    @Override
    public double totalSalary() {
        return super.totalSalary() * this.hesoLuong;
    }

    @Override
    public String toString() {
        return "KiSu{" + super.toString() +
                ", hesoLuong=" + hesoLuong +
                '}';
    }
}

