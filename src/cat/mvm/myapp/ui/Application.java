package cat.mvm.myapp.ui;
import cat.mvm.myapp.entities.Colour;
import cat.mvm.myapp.entities.Employee;
import cat.mvm.myapp.entities.Location;
import cat.mvm.myapp.entities.SalesEmployee;
import cat.mvm.myapp.utils.MyMath;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {
    public static void main(String[] args){
        System.out.println("Hello World");

        System.out.println(MyMath.PI);
        System.out.println(MyMath.E);
        System.out.println(MyMath.PHI);

        System.out.printf("E: %.2f %n", MyMath.E);
        System.out.printf("PI: %.3f %n", MyMath.PI);
        System.out.format("PHI: %.1f %n", MyMath.PHI);

        System.out.println("MyMath.isEven(6)	" + MyMath.isEven(6));
        System.out.println("MyMath.isEven(5)	" + MyMath.isEven(5));
        System.out.println("MyMath.abs(-4)	" + MyMath.abs(-4));
        System.out.println("MyMath.max(4,2,5,3,10,11)	" + MyMath.max(4,2,5,3,10,11));
        System.out.println("MyMath.min(4,2,5,-3,10,11)	" + MyMath.min(4,2,5,-3,10,11));
        System.out.println("MyMath.avg(4,2)	" + MyMath.avg(4,2));
        System.out.println(Colour.getCounter());

        System.out.println("Num. de colors: "+ Colour.getCounter());
        var c1 = new Colour(255, 255,255);
        System.out.println("Num. de colors: "+ Colour.getCounter());
        var c2 = new Colour("Black", 0, 0,0);
        System.out.println("Num. de colors: "+ Colour.getCounter());
        var c3 = new Colour();
        System.out.println("Num. de colors: "+ Colour.getCounter());
        var c4 = Colour.random();
        System.out.println(c4.toRGB());
        System.out.println(c4.toHex(true));
        System.out.println(c4.toHex(false));

        var l1 = new Location();
        var l2 = new Location();
        var l3 = new Location();

        var e1 = new Employee("E001", "Laura", "Velazquez", LocalDate.of(1980, 10, 23), LocalDate.of(2015, 1, 15), 18000);
        System.out.printf("%s%n", e1.toString());

        var e2 = new Employee("E002", "Pedro", "Martin", LocalDate.of(1986, 3, 13), LocalDate.of(2019, 2, 23), 16000);
        System.out.printf("%s%n", e2.toString());

        var e3 = new Employee("E003", "Jaime", "Sanchez", LocalDate.of(1970, 2, 13),  LocalDate.of(2000, 1, 1),14000);
        System.out.printf("%s%n", e3.toString());

        var e4 = new SalesEmployee("E004", "Pedro", "Laguna", LocalDate.of(1970, 2, 13),  LocalDate.of(2000, 1, 1),14000,2000);
        System.out.printf("%s%n", e4.toString());
    }
}
