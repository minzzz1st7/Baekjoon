package TEST;

public class Degree_01 {


    public static void main(String[] args) {
        int px1 = 0, py1 = 0;
        int px2 = 3, py2 = 2;

        float dx = px1 - px2;
        float dy = py1 - py2;

        double radian = Math.atan(dx/dy);
        float degree = (float) (57.29 * radian);

        System.out.println(degree);
    }

}
