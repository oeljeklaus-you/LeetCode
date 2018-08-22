package cn.edu.hust.math;

public class _504_convertToBase7 {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        if (num < 0) {
            flag = true;
            num = Math.abs(num);
        }
        while (num >= 7) {
            sb.append(num % 7);
            num /= 7;
        }
        sb.append(num);
        sb.reverse();
        String result;
        if (flag) result = "-" + sb.toString();
        else result = sb.toString();
        return result;
    }
}
