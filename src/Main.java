import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Botones botones = new Botones(0, 0, 0);

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
                botones.BotonClicker1(frame);
                botones.BotonClicker2(frame);

                actualizar(botones);
                frame.setTitle("Cookie Clicker: | Puntos: " + botones.getPuntos());
                labelPuntos.setText("Puntos: " + botones.getPuntos());
            }
        });
        bucle.start();

        frame.setVisible(true);
    }

    public static void actualizar(Botones botones) {
        if (botones.getContadorClicker() >= 1) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            botones.setPuntos(botones.getPuntos() + botones.getContadorClicker());
        }

        if (botones.getContadorClickerSupremo() >= 5) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            botones.setPuntos(botones.getPuntos() + botones.getContadorClickerSupremo());
        }
    }

}