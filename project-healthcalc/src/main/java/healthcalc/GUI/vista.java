package healthcalc.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class vista {

    private JFrame frame;
    private JTextField txtAltura, txtEdad, txtPeso;
    private JLabel resultado;
    private JButton btnCalcular;
    private JRadioButton rbHombre, rbMujer;
    private JComboBox<String> metodoBox;

    public vista() {
        frame = new JFrame("Calculadora de Salud");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(8, 2));

        frame.add(new JLabel("Altura (cm):"));
        txtAltura = new JTextField();
        frame.add(txtAltura);

        frame.add(new JLabel("Edad (años):"));
        txtEdad = new JTextField();
        frame.add(txtEdad);

        frame.add(new JLabel("Peso (kg):"));
        txtPeso = new JTextField();
        frame.add(txtPeso);

        frame.add(new JLabel("Género:"));
        JPanel panelGenero = new JPanel(new FlowLayout());
        rbHombre = new JRadioButton("Hombre");
        rbMujer = new JRadioButton("Mujer");
        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(rbHombre);
        grupoGenero.add(rbMujer);
        panelGenero.add(rbHombre);
        panelGenero.add(rbMujer);
        frame.add(panelGenero);

        frame.add(new JLabel("Método:"));
        metodoBox = new JComboBox<>(new String[]{"Peso Ideal", "BMR"});
        frame.add(metodoBox);

        btnCalcular = new JButton("Calcular");
        frame.add(btnCalcular);
        resultado = new JLabel("Resultado:");
        frame.add(resultado);

        frame.setVisible(true);
    }

    public int getAltura() {
        return Integer.parseInt(txtAltura.getText());
    }

    public int getEdad() {
        return Integer.parseInt(txtEdad.getText());
    }

    public float getPeso() {
        return Float.parseFloat(txtPeso.getText());
    }

    public char getGenero() {
        return rbMujer.isSelected() ? 'w' : 'm';
    }

    public String getMetodo() {
        return (String) metodoBox.getSelectedItem();
    }

    public void setResultado(String texto) {
        resultado.setText("Resultado: " + texto);
    }

    public void escuchar(ActionListener listener) {
        btnCalcular.setActionCommand("calcular");
        btnCalcular.addActionListener(listener);
    }
}
