package cat.mvm.myapp.entities;

public class Colour {
    private String name;
    private int blue;
    private int green;
    private int red;

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

    public String toRGB(){
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    public String toRGB(boolean upperCase){
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    public String toHEX(){
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    public String toHEX(boolean upperCase){
        throw new UnsupportedOperationException("Not yet implemented!");
    }
}
