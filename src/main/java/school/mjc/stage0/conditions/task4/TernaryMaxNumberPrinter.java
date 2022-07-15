package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = first <= second ? second : first;
        int max = result <= third ? third : result;
        System.out.println(max);
    }
}
