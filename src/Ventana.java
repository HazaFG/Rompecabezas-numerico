import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class Ventana extends JFrame {

    private JPanel contentPane;

    String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " "};
    //List<String>values = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " ");

    private ArrayList<String> textosDisponibles;

    JButton btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnDiez, btnOnce, btnDoce, btnTrece, btnCatorce, btnQuince, btnVacio;

    Random rand =  new Random();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana frame = new Ventana();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(45, 45, 45));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(190, 162, 187));
        panel.setBounds(47, 46, 475, 475);
        contentPane.add(panel);
        panel.setLayout(null);

        btnUno = new JButton("");
        btnUno.setBounds(24, 26, 98, 101);
        //btnUno.setText(numeros[rand.nextInt(numeros.length)]);
        //btnUno.setText(values.get(i));
        panel.add(btnUno);

        btnDos = new JButton("");
        btnDos.setBounds(133, 26, 98, 101);
        //btnDos.setText(values.get(i));
        btnDos.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnDos);

        btnTres = new JButton("");
        btnTres.setBounds(241, 26, 98, 101);
        //btnTres.setText(numeros[rand.nextInt(numeros.length)]);
        //btnTres.setText(values.get(i));
        panel.add(btnTres);

        btnCuatro = new JButton("");
        btnCuatro.setBounds(349, 26, 98, 101);
        //btnCuatro.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnCuatro);

        btnCinco = new JButton("");
        btnCinco.setBounds(24, 137, 98, 101);
        //btnCinco.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnCinco);

        btnSeis = new JButton("");
        btnSeis.setBounds(133, 137, 98, 101);
        //btnSeis.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnSeis);

        btnSiete = new JButton("");
        btnSiete.setBounds(241, 137, 98, 101);
        //btnSiete.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnSiete);

        btnOcho = new JButton("");
        btnOcho.setBounds(349, 137, 98, 101);
        //btnOcho.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnOcho);

        btnNueve = new JButton("");
        btnNueve.setBounds(24, 248, 98, 101);
        //btnNueve.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnNueve);

        btnDiez = new JButton("");
        btnDiez.setBounds(133, 248, 98, 101);
        //btnDiez.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnDiez);

        btnOnce = new JButton("");
        btnOnce.setBounds(241, 248, 98, 101);
        //btnOnce.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnOnce);

        btnDoce = new JButton("");
        btnDoce.setBounds(349, 248, 98, 101);
        //btnDoce.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnDoce);

        btnTrece = new JButton("");
        btnTrece.setBounds(24, 359, 98, 101);
        //btnTrece.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnTrece);

        btnCatorce = new JButton("");
        btnCatorce.setBounds(133, 359, 98, 101);
        //btnCatorce.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnCatorce);

        btnQuince = new JButton("");
        btnQuince.setBounds(241, 359, 98, 101);
        //btnQuince.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnQuince);

        btnVacio = new JButton("");
        btnVacio.setBounds(349, 359, 98, 101);
        panel.add(btnVacio);

        inicializarTextoBotones();
        asignarTextosAleatorios();
    }

    public void inicializarTextoBotones() {
        textosDisponibles = new ArrayList<String>();
        textosDisponibles.add("1");
        textosDisponibles.add("2");
        textosDisponibles.add("3");
        textosDisponibles.add("4");
        textosDisponibles.add("5");
        textosDisponibles.add("6");
        textosDisponibles.add("7");
        textosDisponibles.add("8");
        textosDisponibles.add("9");
        textosDisponibles.add("10");
        textosDisponibles.add("11");
        textosDisponibles.add("12");
        textosDisponibles.add("13");
        textosDisponibles.add("14");
        textosDisponibles.add("15");
        textosDisponibles.add(" ");
    }

    private void asignarTextosAleatorios() {
        Collections.shuffle(textosDisponibles);
        btnUno.setText(textosDisponibles.get(0));
        btnDos.setText(textosDisponibles.get(1));
        btnTres.setText(textosDisponibles.get(2));
        btnCuatro.setText(textosDisponibles.get(3));
        btnCinco.setText(textosDisponibles.get(4));
        btnSeis.setText(textosDisponibles.get(5));
        btnSiete.setText(textosDisponibles.get(6));
        btnOcho.setText(textosDisponibles.get(7));
        btnNueve.setText(textosDisponibles.get(8));
        btnDiez.setText(textosDisponibles.get(9));
        btnOnce.setText(textosDisponibles.get(10));
        btnDoce.setText(textosDisponibles.get(11));
        btnTrece.setText(textosDisponibles.get(12));
        btnCatorce.setText(textosDisponibles.get(13));
        btnQuince.setText(textosDisponibles.get(14));
        btnVacio.setText(textosDisponibles.get(15));
    }
}