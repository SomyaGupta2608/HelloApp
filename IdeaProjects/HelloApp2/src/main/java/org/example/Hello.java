package org.example;
public class Hello {
    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop to iterate through arguments
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Print final output
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}