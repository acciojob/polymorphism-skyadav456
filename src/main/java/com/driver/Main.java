package com.driver;
public class Main {


    static class Product {

        // Task 3
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4 (Overloaded)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5 (Overloaded)
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {

        //  Task 2: Create object
        Product p = new Product();

        // Calling all methods

        int result1 = p.product(2, 3);
        System.out.println("Product of 2 numbers: " + result1);

        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 3 numbers: " + result2);

        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of double numbers: " + result3);
    }
}