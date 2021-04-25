import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class HW7 {
    public void task1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = input.nextInt();
        int medium = size / 2;
        if (size < 1 || size % 2 == 0) {
            System.out.println("Size entered incorrectly, please enter size>0 and size%2==1");
        } else {
            for (int i = 0; i < size; i++) {
                if (i <= medium) {
                    for (int j = 0; j < size; j++) {
                        if (j > medium - i && j <= medium + i - 1) {
                            System.out.print("  ");
                        } else {
                            System.out.print(" #");
                        }
                    }
                } else {
                    for (int j = 0; j < size; j++) {
                        if (j > medium + i - size + 1 && j <= medium - i + size - 2) {
                            System.out.print("  ");
                        } else {
                            System.out.print(" #");
                        }}}
                System.out.println();
            }
        }
    }

    public void task2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = input.nextInt();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                for (int p = 1; p < size - i; p++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < (i + 1); j++) {
                    System.out.print((i - j + 1) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Size entered incorrectly, please enter size>0");
        }
    }

    public void task3() {
        String firstString = "Body_moving";
        firstString = firstString.toLowerCase();
        String secondString = "My body is fat";
        secondString = secondString.toLowerCase();
        if (firstString.compareToIgnoreCase(secondString) != 0) {
            System.out.println("Result: Strings contain different symbols.");
            System.out.print("2st doesn’t contain: ");
            for (int i = 0; i < firstString.length(); i++) {
                boolean flag = false;
                for (int j = 0; j < secondString.length(); j++) {
                    if (firstString.charAt(i) == secondString.charAt(j)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.print("'" + firstString.charAt(i) + "' ");
                }
            }
            System.out.println();
            System.out.print("1st doesn’t contain: ");
            for (int i = 0; i < secondString.length(); i++) {
                boolean flag = false;
                for (int j = 0; j < firstString.length(); j++) {
                    if (secondString.charAt(i) == firstString.charAt(j)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag && secondString.charAt(i) != ' ') {
                    System.out.print("'" + secondString.charAt(i) + "' ");
                }
            }
        } else {
            System.out.println("2 strings contain the same symbols");
        }
    }

        static boolean task4(String first, String second, String result) {
            if(first.length() + second.length() != result.length()) {
                return false;
            }
            int i = 0, j = 0, k = 0;
            while (k != result.length()) {
                if (i < first.length() && first.charAt(i) == result.charAt(k))
                    i++;
                else if (j < second.length() && second.charAt(j) == result.charAt(k))
                    j++;
                else {
                    return false;
                }
                k++;
            }
            return i >= first.length() && j >= second.length();
        }

    public void task5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int sumNum = sum(num);
        System.out.println("Sum all number = " + sumNum);
    }   static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public void task6() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the array:  ");
        int id1 = sc.nextInt();
        System.out.println("Enter the width of the array:  ");
        int id2 = sc.nextInt();
        int[][] arr = new int[id1][id2];
        for (int i =0; i<arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rd.nextInt(20);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



