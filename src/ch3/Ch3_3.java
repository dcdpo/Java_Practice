package ch3;

/*
    多個變數一同宣告
 */
public class Ch3_3 {
    public static void main(String[] args) {
        int x, y, z, s;

        x = 120;
        z = x * 8 * 300;
        y = 9000 * 12;
        s = z - y;
        System.out.println("一年可以儲存 : " + s);
    }
}
