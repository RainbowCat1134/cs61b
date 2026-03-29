import java.util.*;

public class ArrayBasics {
    public static void main(String[] args){
        int[] z = null;
        //注意，x和y存放的是数组的地址
        int[] x, y;

        x = new int[]{1, 2, 3, 4, 5};
        //因为x和y都是地址所以才能用等号赋值y
        y = x;
        x = new int[]{-1, 2, 5, 4, 99};
        y = new int[3];
        z = new int[0];
        //注意.length不是方法，不需要写括号
        int xL = x.length;

        String[] s = new String[6];
        s[4] = "ketchup";
        s[x[3] - x[1]] = "muffins";

        int[] b = {9, 10, 11};
        //参数说明：System.arraycopy(<原始数组>,<起始位置>,<被粘贴数组>,<起始位置>,<长度>)
        System.arraycopy(b, 0, x, 3, 2);

    }
}
