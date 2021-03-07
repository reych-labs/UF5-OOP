package cat.mvm.myapp.entities;

import cat.mvm.myapp.utils.MyMath;
import java.util.Random;

public class Colour {
    private String name;
    private int blue;
    private int green;
    private int red;

    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 255;
    public static final String NO_NAME = "Undefined";
    private static int counter = 0;

    //constructor principal: el que té major lògica de paràmetres a inicialitzar
    public Colour(String name, int red, int green, int blue) {
        counter++; //increment de l'atribut a nivell de classe
        this.setName(name);
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
    }

    public Colour(int red, int green, int blue) {
        this(NO_NAME, red, green, blue);
    }

    public Colour() {
        this(NO_NAME, MAX_VALUE, MAX_VALUE, MAX_VALUE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public String toRGB(boolean upperCase) {
        //return ((upperCase) ? "RGB(" : "rgb(") + this.getRed() + ", " + this.getGreen()+ ", " + this.getBlue() + ")";
        return String.format("%s(%d,%d,%d)", upperCase ? "RGB" : "rgb", this.getRed(), this.getGreen(), this.getBlue());
        //throw new UnsupportedOperationException("Not yet implemented!!");
    }

    public String toRGB() {
        return toRGB(false);
    }

    public String toHex(boolean upperCase) {
        //throw new UnsupportedOperationException("Not yet implemented!!");
        return String.format(upperCase ? "#%02X%02X%02X" : "#%02x%02x%02x", this.getRed(), this.getGreen(), this.getBlue());
    }

    public String toHex() {
        return toHex(true);
    }

    public static int getCounter() {
        return counter;
    } //ens retorna el valor de classe counter

    public static Colour random(){
        return new Colour(MyMath.nextInt(MAX_VALUE), MyMath.nextInt(MAX_VALUE), MyMath.nextInt(MAX_VALUE));
    }

    public static Colour fromHex(String color) {
        //#FFFFFF-----> [] red: 255 green: 255 blue: 255
        return new Colour(Integer.parseInt(color.substring(1,3), MyMath.BASE_16), Integer.parseInt(color.substring(3,5), MyMath.BASE_16), Integer.parseInt(color.substring(5,7), MyMath.BASE_16));
    }
}
