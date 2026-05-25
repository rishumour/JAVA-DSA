public class Functions_4_AREA_OF_CIRCLE {
    public static double area_circle(int r){
        double area = 2 * 3.14 * r * r;
        return area;
    }
    public static void main(String[] args){
        System.out.println("area of circle = " + area_circle(3));
    }
}
