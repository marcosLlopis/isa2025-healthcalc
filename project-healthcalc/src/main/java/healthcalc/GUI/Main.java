package healthcalc.GUI;

import java.awt.EventQueue;
import healthcalc.health;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                vista vista = new vista();
                health modelo = new health();
                new controlador(vista, modelo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
