package healthcalc.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import healthcalc.health;
import healthcalc.GUI.vista;

public class controlador implements ActionListener {

    private vista vista;
    private health modelo;

    public controlador(vista vista, health modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.escuchar(this); // Conecta eventos con la vista
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int edad = vista.getEdad();
            int altura = vista.getAltura();
            float peso = vista.getPeso();
            char genero = vista.getGenero();
            String metodo = vista.getMetodo();

            if ("Peso Ideal".equals(metodo)) {
                float ideal = modelo.idealWeight(altura, genero);
                vista.setResultado(String.format("%.2f kG", ideal));
            } else if ("BMR".equals(metodo)) {
                float bmr = modelo.basalMetabolicRate(peso, altura, edad, genero);
                vista.setResultado(String.format("%.2f cal/día", bmr));
            }
        } catch (Exception ex) {
            vista.setResultado("Error: " + ex.getMessage());
        }
    }
}
