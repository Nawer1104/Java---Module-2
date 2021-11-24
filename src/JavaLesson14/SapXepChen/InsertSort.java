package JavaLesson14.SapXepChen;

public class InsertSort {
    public static void Insert(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int X = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > X; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = X;
            System.out.println("Array after sort " + i);
            for (int h = 0; h < arr.length; h++) {
                System.out.print(arr[h] + "\t");
            }
            System.out.println();
        }
        System.out.println("Array after finished: ");
        for (int h = 0; h < arr.length; h++) {
            System.out.print(arr[h] + "\t");
        }
    }

    public static void main(String[] args) {
        int[] list = {29, 26, 2 , 5 , 7 , 11, 95};
        Insert(list);
    }
}
