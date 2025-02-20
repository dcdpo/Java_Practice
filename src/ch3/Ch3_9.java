package ch3;

/*
    長整數和家底線數字表示法的應用
 */
public class Ch3_9 {
    public static void main(String[] args) {
        long x;

        x = 10345678L;                      // 設定10進位長整數
        System.out.println("列印10345678 的值 = " + x);
        x = 1_000_200;                      // 設定含底線整數
        System.out.println("列印1_000_200 的值 = " + x);
        x = 2_0000;                         // 設定含底線整數
        System.out.println("列印2_0000 的值 = " + x);
    }
}
