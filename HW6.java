import java.util.Scanner;
public class HW6 {
    public static void task1(String text) {
        System.out.println(text.length());
    }

    public static void task2(String s1) {
        char[] arr = s1.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void task3(String s1) {
        char[] arr = s1.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
}

    public void task4(String s1) {
        String[] arr;
        arr = s1.split(" ");
        for(int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void task5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Fill in the text:");
        String s1 = input.nextLine();
        System.out.println("Fill in the char id to delete:");
        int id = input.nextInt();
        StringBuilder sb = new StringBuilder(s1);
        sb.deleteCharAt(id);
        System.out.println(sb);
    }
}
