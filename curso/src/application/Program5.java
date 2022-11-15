package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Shape;
import entites.enums.Color;

public class Program5 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Shape #" + i + "data:");
            System.out.println("Rectangle or Circle (r/c)?");
            char ch = sc.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED)");
            Color color = Color.valueOf(sc.next());
            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle1(color, width, height));
            }else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        sc.close();
    }

}
