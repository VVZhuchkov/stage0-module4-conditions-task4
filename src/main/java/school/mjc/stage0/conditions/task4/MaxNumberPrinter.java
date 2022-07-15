package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max;
        if (first <= second) {
            max = second;
        } else {
            max = first;
        }
        if (max < third) {
            max = third;
        }
        System.out.println(max);
    }
}
