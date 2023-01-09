package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        //5876
        //5+6+8
        System.out.println(number/1000+number%10+number/100%10+number/10%10);
    }
}
