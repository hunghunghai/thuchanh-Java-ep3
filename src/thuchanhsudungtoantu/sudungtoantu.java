package thuchanhsudungtoantu;

import java.util.Scanner;

public class sudungtoantu {
    public static void main(String[] args) {
        float wight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight:");
        wight = scanner.nextFloat();
        System.out.println("Enter height:");
        height = scanner.nextFloat();
        float arena = wight*height;
        System.out.println("Area is: "+arena);
    }
}
