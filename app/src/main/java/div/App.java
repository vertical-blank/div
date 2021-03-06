/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package div;

public class App {

    private static int div(int i1, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 division");
        }

        int ret = 0;

        int wk = i1;
        int divider = i2;
        int shift = 0;

        // 桁揃え
        while (true) {
            if (i1 >= divider << 1) {
                divider = divider << 1;
                shift++;
            } else {
                break;
            }
        }


        while (shift >= 0) {
            if (wk >= divider) {
                wk = wk - divider;
                // 左シフトし右端を1に
                ret = ret << 1;
                ret = ret | 1;
            } else {
                ret <<= 1;
            }

            divider = divider >> 1;
            shift--;
        }

        return ret;
    }

    public static void main(String[] args) {
        int i1 = Integer.valueOf(args[0]);
        int i2 = Integer.valueOf(args[1]);

        System.out.println(div(i1, i2));
        System.out.println(i1 / i2);
    }
}
