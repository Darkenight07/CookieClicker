import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Botones {

    int puntos;
    int contadorClicker;
    int contadorClickerSupremo;
    public Botones(int puntos, int contadorClicker, int contadorClickerSupremo) {
        this.puntos = puntos;
        this.contadorClicker = contadorClicker;
        this.contadorClickerSupremo = contadorClickerSupremo;
    }

    public void BotonGalleta(JFrame frame) {
        JButton botonGalleta = new JButton("Galleta");
        botonGalleta.setBounds(330, 250, 145, 50);
        frame.add(botonGalleta);

        botonGalleta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                puntos++;
            }
        });
    }

    public void BotonClicker1(JFrame frame) {
        JButton clicker1 = new JButton("Comprar 1 Clicker");
        clicker1.setBounds(180, 350, 145, 40);
        frame.add(clicker1);

        clicker1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (puntos >= 50) {
                    puntos -= 50;
                    contadorClicker += 5;
                } else {
                    JOptionPane.showMessageDialog(null, "No tienes suficientes puntos");
                }
            }
        });

    }

    public void BotonClicker2(JFrame frame) {
        JButton clicker2 = new JButton("Comprar 1 ClickerSupremo");
        clicker2.setBounds(330, 350, 145, 40);
        frame.add(clicker2);
    }

    public int getContadorClicker() {
        return contadorClicker;
    }

    public int getContadorClickerSupremo() {
        return contadorClickerSupremo;
    }

    public int getPuntos() {
        return puntos;
    }
}
