package CongNhanVaKiSu;

public class TestCongNhanVaKiSu {
    public static void main(String[] args) {
        CongNhan congNhan = new CongNhan(
                "Nam",
                "Ha Noi",
                3000,
                400457,
                "0865538810",
                26
        );

        KiSu kiSu = new KiSu(
                "Minh",
                "Ha Noi",
                3500,
                400469,
                "096969699",
                26
        );

        System.out.println(congNhan.totalSalary());
        System.out.println(kiSu.totalSalary());

        System.out.println(congNhan);
        System.out.println(kiSu);
    }
}
