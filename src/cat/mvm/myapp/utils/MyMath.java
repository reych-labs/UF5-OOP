package cat.mvm.myapp.utils;

public class MyMath{
    public static final double PI = 3.14159265;
    public static final double E = 2.71828;
    public static final double PHI = (1 +  Math.sqrt(5))/2;

    public static boolean isEven(int value){
        return (value % 2 == 0);
    }

    public static boolean isOdd(int value){
        //return (value % 2 != 0);
        return !isEven(value);
    }

    public static int abs(int value){
        return (value < 0) ? -value : value;
    }

    public static double max(double op1, double op2, double... ops){
        var max =  (op1 >= op2) ? op1 : op2;
        for(var op : ops){
            max =  (op >= max) ? op : max;
        }
        return max;
    }

    public static double min(double op1, double op2, double... ops){
        var min =  (op1 <= op2) ? op1 : op2;
        for(var op : ops){
            min =  (op <= min) ? op : min;
        }
        return min;
    }

    public static double avg(double op1, double op2, double... ops){
        var suma = op1 + op2;
        for(var op : ops){
            suma += op; // suma = suma + op
        }
        return suma / (ops.length + 2);
    }
}