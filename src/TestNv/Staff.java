package TestNv;

public class Staff {
    private static int idNumber = 1;
    private String phoneNumber;
    private String name;
    private String address;
    private int id;

    public Staff(String name, String address , String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.id = idNumber++;
    }


    public int getId() {
        return id;
    }

    public Staff() {
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static void setIdNumber(int idNumber) {
        Staff.idNumber = idNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Staff{" + "id=" + id +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
