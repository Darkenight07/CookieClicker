import javax.swing.*;

public class Main {
    public static int puntos = 0;
    public static void main(String[] args) {
        Botones botones = new Botones(1, 0, 0);

        JFrame frame = new JFrame("Cookie Clicker: | Puntos: ");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);


        JLabel labelPuntos = new JLabel("Puntos: ");
        labelPuntos.setBounds(10, 10, 100, 30);
        frame.add(labelPuntos);

        Thread bucle = new Thread(() -> {
            while (true) {
                botones.BotonGalleta(frame);
                puntos = botones.getPuntos();
                botones.BotonClicker1(frame);
                botones.BotonClicker2(frame);

                verificadorBotonesPuntos(botones);
                frame.setTitle("Cookie Clicker: | Puntos: " + puntos);
                labelPuntos.setText("Puntos: " + puntos);
            }
        });
        bucle.start();

        frame.setVisible(true);
    }

    public static void verificadorBotonesPuntos(Botones botones) {
        if (botones.getContadorClicker() >= 5) {
            puntos += botones.getContadorClicker();
        }
    }
    public static void actualizar() {
        
    }


}