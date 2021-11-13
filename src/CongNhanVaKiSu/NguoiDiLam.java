package CongNhanVaKiSu;

public abstract class NguoiDiLam {
    private String name;
    private String address;
    private int salary;
    private int id;
    private String phoneNumber;
    private int workingDay;

    public NguoiDiLam(String name, String address, int salary, int id, String phoneNumber, int workingDay) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.workingDay = workingDay;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public abstract double totalSalary();

    @Override
    public String toString() {
        return "NguoiDiLam{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", workingDay=" + workingDay +
                '}';
    }
}
