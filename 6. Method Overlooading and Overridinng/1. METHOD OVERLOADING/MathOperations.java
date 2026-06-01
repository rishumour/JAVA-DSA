class MathOperations {
    
    // Method with 2 integer parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 integer parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int a = 77;
        int b = 56;
        int c = 46;
        int sum = add(a, b , c);
        System.out.println(sum);
    }
}