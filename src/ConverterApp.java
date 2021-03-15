import javax.swing.*;

public class ConverterApp {
    public static void main(String[] args) {
        try {
            // Aspecto de la interfaz gráfica
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e) {
            System.out.println("NNo s'ha pogut establir l'aspecte desitjat: " + e);
        }
        var app = new Converter();
        app.setVisible(true);
    }
}
