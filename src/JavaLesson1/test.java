package JavaLesson1;

public class test {
    private int id;
    private String name;
    private int phoneNumber;
    private String address;

    private static int idNumber = 1;

    public test(String name, int phoneNumber, String address) {
        this.id = idNumber++;
        this.name = name;

        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int value) {
        this.phoneNumber = value;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "test{" + "id=" + id +
                ", name='" + name + '\'' +
                ", phone number=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}





