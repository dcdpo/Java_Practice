package ch3;

/*
    註解的重要性
 */
public class Ch3_6 {
    public static void main(String[] args) {
        int hourlySalary = 120;                             //  設定時薪
        int monthlyFee = 9000;                              //  設定每月花費
        int annualSalary, annualFee, annualSavings;

        annualSalary = hourlySalary * 8 * 300;              //  計算年薪
        annualFee = monthlyFee * 12;                        //  計算每年花費
        annualSavings = annualSalary - annualFee;           //  計算每年儲存金額
        System.out.println("一年可以儲存 : " + annualSavings);
    }
}
