import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Botones {

    public int puntos;
    public int contadorClicker;
    public int contadorClickerSupremo;
    private int contadorClickerSupremoNum;

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
                if (contadorClicker >= 5) {
                    JOptionPane.showMessageDialog(null, "No puedes comprar mas clickers, tienes " + contadorClicker + " clickers, solo se pueden comprar 5");
                } else if (puntos >= 10) {
                    puntos -= 10;
                    contadorClicker += 1;
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


        clicker2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (contadorClickerSupremoNum >= 5) {
                    JOptionPane.showMessageDialog(null, "No puedes comprar mas clickers supremos, tienes " + contadorClickerSupremoNum + " clickers supremos, solo se pueden comprar 5");
                } else if (puntos >= 100) {
                    puntos -= 100;
                    contadorClickerSupremo += 5;
                    contadorClickerSupremoNum++;
                } else {
                    JOptionPane.showMessageDialog(null, "No tienes suficientes puntos");
                }
            }
        });
    }
    public int getContadorClicker() {
        return contadorClicker;
    }

    public int getContadorClickerSupremo() {
        return contadorClickerSupremoNum;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
