import java.util.Arrays;
public class HW5 {

    public void task1() {
    }
    static class DisplayOverloading {
            public void disp(int a) {
                System.out.println(a);
            }
            public void disp(int b, int c){
                System.out.println(b + c);
            }
            public void disp(double d, int e) {
                System.out.println(d + e);
        }
            public void disp(int f, double g) {
                System.out.println(f * g);
            }
            public void disp(int h, float j, String k) {
                System.out.println(h / j + k);
            }
        }

    public static void task2(int a, int b, int c)
    {
        if (c <=19){
            System.out.println(b);
            int currentValue = a + b;
            c++;
            task2(b, currentValue, c);
        }
    }

    public void task3() {
        int[] row = new int[20];
        for (int i = 0; i < row.length; i++) {
            row[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(row));
    }

    public void task4() {
        int[] arr = new int[20];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 17);
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.print(Arrays.toString(arr));
            System.out.println();
    }

    public void task5() {
                int[] row = new int[20];
                for (int i = 0; i < row.length; i++) {
                    row[i] = (int) (Math.random() * 17);
                }
                int n = row.length;
                for (int j = 1; j < n; j++) {
                    int temp = row[j];
                    int i = j-1;
                    while ( (i > -1) && ( row [i] > temp ) ) {
                        row [i+1] = row [i];
                        i--;
                    }
                    row[i+1] = temp;
                }
                System.out.print(Arrays.toString(row));
                }
            }

