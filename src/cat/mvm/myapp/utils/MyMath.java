package cat.mvm.myapp.utils;

import cat.mvm.myapp.entities.Colour;

import java.util.Random;

public class MyMath{
    public static final double PI = 3.14159265;
    public static final double E = 2.71828;
    public static final double PHI = (1 +  Math.sqrt(5))/2;
    private static final Random RND = new Random();

    public static final int BASE_2 = 2;
    public static final int BASE_8 = 8;
    public static final int BASE_10 = 10;
    public static final int BASE_16 = 16;

    //per evitar instàncies de la classe
    private MyMath(){}

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

    public static int nextInt(int bound){
        return RND.nextInt(bound+1);
    }
}