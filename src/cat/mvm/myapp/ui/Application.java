package cat.mvm.myapp.ui;
import cat.mvm.myapp.entities.Colour;
import cat.mvm.myapp.entities.Employee;
import cat.mvm.myapp.entities.Location;
import cat.mvm.myapp.utils.MyMath;

public class Application {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(MyMath.PI);
        System.out.println(MyMath.E);
        System.out.println(MyMath.PHI);

        System.out.println("MyMath.isEven(6)	" + MyMath.isEven(6));
        System.out.println("MyMath.isEven(5)	" + MyMath.isEven(5));
        System.out.println("MyMath.abs(-4)	" + MyMath.abs(-4));
        System.out.println("MyMath.max(4,2,5,3,10,11)	" + MyMath.max(4,2,5,3,10,11));
        System.out.println("MyMath.min(4,2,5,-3,10,11)	" + MyMath.min(4,2,5,-3,10,11));
        System.out.println("MyMath.avg(4,2)	" + MyMath.avg(4,2));

        var c1 = new Colour();
        var c2 = new Colour();
        var c3 = new Colour();

        var l1 = new Location();
        var l2 = new Location();
        var l3 = new Location();

        var e1 = new Employee();
        var e2 = new Employee();
        var e3 = new Employee();
    }
}
