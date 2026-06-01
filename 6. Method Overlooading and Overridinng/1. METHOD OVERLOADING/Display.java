class Display {
    
    public static void print(int number) { // Method with an integer parameter
        System.out.println("Printing integer: " + number);
    }
    
    public static void print(double number) { // Overloaded method with a double parameter
        System.out.println("Printing double: " + number);
    }

    public static void print(String text) {  // Overloaded method with a String parameter
        System.out.println("Printing string: " + text);
    }

    public void main(String[] args) {
        Display display = new Display();
        
        display.print(42);           
        display.print(3.14159);    
        display.print("Hello!");     
    }
}