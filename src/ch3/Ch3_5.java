package ch3;

public class Ch3_5 {
    public static void main(String[] args) {
        int hourSalary = 120;
        int monthlyFee = 9000;
        int annualSalary, annualFee, annualSavings;

        annualSalary = hourSalary * 8 * 300;
        annualFee = monthlyFee * 12;
        annualSavings = annualSalary - annualFee;
        System.out.println(" 一年可以儲存 : " + annualSavings);
    }
}
