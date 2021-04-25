class Main {
    public static void main(String[] args) {
        HW5 hw5 = new HW5();
        HW5.DisplayOverloading task1 = new HW5.DisplayOverloading();
        task1.disp(4);
        task1.disp(4,5);
        task1.disp(3.4, 4);
        task1.disp(3,3.5);
        task1.disp(10, 3.3f, "D");
        hw5.task1();
        hw5.task2(0,1, 0);
        hw5.task3();
        hw5.task4();
        hw5.task5();

    }
}

