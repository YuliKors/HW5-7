public class Main {
    public static void main(String[] args){
        HW7 hw7 = new HW7();
        hw7.task1();
        hw7.task2();
        hw7.task3();
        hw7.task5();
        hw7.task6();

        String first = "NY";
        String second = "21";
        String[] results = {"2NY1", "N21Y"};
        for (String result : results) {
            if (HW7.task4(first, second, result)) {
                System.out.println(result + " is a valid shuffle of " + first + " and " + second);
            } else {
                System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
            }
        }}
}
