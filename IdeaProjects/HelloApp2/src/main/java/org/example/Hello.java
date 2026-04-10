package org.example;
public class Hello {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        for (String name : args){
            nameBuilder.append(name).append(",");
        }
        if(nameBuilder.length() > 0) {
            String name = nameBuilder.substring(0, nameBuilder.length() - 2);
        }
    }
}