import javax.swing.*;
import java.awt.event.*;

public class Converter extends JFrame {
    private JButton jbtAceptar;
    //private JButton jbtCancelar;
    private JLabel jlbGradosC;
    private JLabel jlbGradosF;
    private JTextField jtfGradosC;
    private JTextField jtfGradosF;
    private Object objJTextField;

    public Converter() {
        setSize(300, 200);
        setTitle("Conversión de temperaturas");
        initComponents();
    }

    /** Este método es llamado por el constructor para
     *  iniciar el formulario.
     */

    private void initComponents() {
        jlbGradosC = new JLabel();
        jtfGradosC = new JTextField();
        jlbGradosF = new JLabel();
        jtfGradosF = new JTextField();
        jbtAceptar = new JButton();
        //jbtCancelar = new JButton();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                exitForm(evt);
            }

            public void windowOpened(WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jlbGradosC.setText("Graus centígrads");
        getContentPane().add(jlbGradosC);
        jlbGradosC.setBounds(12, 28, 116, 14);

        jtfGradosC.setHorizontalAlignment(JTextField.RIGHT);
        jtfGradosC.setText("0.00");
        jtfGradosC.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                jtfGradosFocusGained(evt);
            }
        });
        jtfGradosC.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                jtfGradosKeyTyped(evt);
            }
        });
        getContentPane().add(jtfGradosC);
        jtfGradosC.setBounds(132, 28, 144, 20);

        jlbGradosF.setText("Graus fahrenheit");
        getContentPane().add(jlbGradosF);
        jlbGradosF.setBounds(12, 68, 104, 24);

        jtfGradosF.setHorizontalAlignment(JTextField.RIGHT);
        jtfGradosF.setText("32.00");
        jtfGradosF.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                jtfGradosFocusGained(evt);
            }
        });
        jtfGradosF.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                jtfGradosKeyTyped(evt);
            }
        });
        getContentPane().add(jtfGradosF);
        jtfGradosF.setBounds(132, 72, 144, 20);

        jbtAceptar.setMnemonic('A');
        jbtAceptar.setText("Acceptar");
        getRootPane().setDefaultButton(jbtAceptar);
        jbtAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jbtAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtAceptar);
        jbtAceptar.setBounds(175, 120, 100, 24);

        /*jbtCancelar.setMnemonic('C');
        jbtCancelar.setText("Cancelar");
        getRootPane().setDefaultButton(jbtCancelar);
        jbtCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //funció a implementar
            }
        });
        getContentPane().add(jbtCancelar);
        jbtCancelar.setBounds(50, 120, 100, 24);*/
    }

    private void formWindowOpened (WindowEvent evt) {
        jtfGradosC.requestFocus();
    }


    private void exitForm(WindowEvent evt) {
        System.exit(0);
    }

    private void jbtAceptarActionPerformed(ActionEvent evt) {
        try {
            double grados;
            if(objJTextField == jtfGradosC) {
                grados = Double.parseDouble(jtfGradosC.getText()) * 9.0 / 5.0 + 32.0;
                String texto = String.format("%.2f", grados);
                jtfGradosF.setText(texto);
            }

            if(objJTextField == jtfGradosF) {
                grados =(Double.parseDouble(jtfGradosF.getText()) - 32.0) * 5.0 / 9.0;
                String texto = String.format("%.2f", grados);
                jtfGradosC.setText(texto);
            }
        } catch(NumberFormatException e) {
            jtfGradosC.setText("0.00");
            jtfGradosF.setText("32.00");
        }
    }

    private void jtfGradosKeyTyped(KeyEvent evt) {
        objJTextField = evt.getSource();
    }

    private void jtfGradosFocusGained(FocusEvent evt) {
        JTextField objEnfocado =(JTextField)evt.getSource();
        objEnfocado.selectAll();
    }
}
