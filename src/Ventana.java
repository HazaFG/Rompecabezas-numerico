import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private JPanel contentPane;

    String[] numeros = {"1", " ", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " "};
    //List<String>values = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " ");

    private ArrayList<String> textosDisponibles;

    private Timer timer;
    private long startTime;
    JButton btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnDiez, btnOnce, btnDoce, btnTrece, btnCatorce, btnQuince, btnDiezYSeis;
    private String textoGuardado;
    Random rand =  new Random();

    private int textito;
    private JLabel lblTiempo;
    private JLabel lblTiempo_1;

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
        setBounds(100, 100, 751, 621);
        setTitle("Rompecabezas Numérico");
        setResizable(false);
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
        btnUno.setBackground(new Color(255, 255, 255));
        btnUno.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnUno.setBounds(24, 26, 98, 101);

        btnUno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textito = 1;
                System.out.println(textito);
            }
        });
        panel.add(btnUno);

        btnUno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnUno.getText() == " ") {
                    System.out.println("Esta vacio");

                    switch(textito) {
                        case 5:
                            System.out.println("El 5 funciono: "+textito);
                            btnCinco.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnUno.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (12)
                            break;
                        case 2:
                            System.out.println("El 2 funciono: "+textito);
                            btnDos.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnUno.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                    }
                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 1;
                    textoGuardado = btnUno.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });

        btnDos = new JButton("");
        btnDos.setBackground(new Color(255, 255, 255));
        btnDos.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnDos.setBounds(133, 26, 98, 101);
        btnDos.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnDos);

        btnDos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnDos.getText() == " ") {
                    System.out.println("Esta vacio");

                    switch(textito) {
                        case 1:
                            System.out.println("El 1 funciono: "+textito);
                            btnUno.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnDos.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (12)
                            break;
                        case 6:
                            System.out.println("El 6 funciono: "+textito);
                            btnSeis.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnDos.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 3:
                            System.out.println("El 3 funciono: "+textito);
                            btnTres.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnDos.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                    }



                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 2;
                    textoGuardado = btnDos.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });


        btnTres = new JButton("");
        btnTres.setBackground(new Color(255, 255, 255));
        btnTres.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnTres.setBounds(241, 26, 98, 101);
        panel.add(btnTres);

        btnTres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnTres.getText() == " ") {
                    System.out.println("Esta vacio");


                    switch(textito) {
                        case 2:
                            System.out.println("El 2 funciono: "+textito);
                            btnDos.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnTres.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (12)
                            break;
                        case 7:
                            System.out.println("El 7 funciono: "+textito);
                            btnSiete.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnTres.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 4:
                            System.out.println("El 4 funciono: "+textito);
                            btnCuatro.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnTres.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                    }



                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 3;
                    textoGuardado = btnTres.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });

        btnCuatro = new JButton("");
        btnCuatro.setBackground(new Color(255, 255, 255));
        btnCuatro.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnCuatro.setBounds(349, 26, 98, 101);
        panel.add(btnCuatro);

        btnCuatro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnCuatro.getText() == " ") {
                    System.out.println("Esta vacio");


                    switch(textito) {
                        case 3:
                            System.out.println("El 3 funciono: "+textito);
                            btnTres.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnCuatro.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (12)
                            break;
                        case 8:
                            System.out.println("El 8 funciono: "+textito);
                            btnOcho.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnCuatro.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                    }



                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 4;
                    textoGuardado = btnCuatro.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });

        btnCinco = new JButton("");
        btnCinco.setBackground(new Color(255, 255, 255));
        btnCinco.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnCinco.setBounds(24, 137, 98, 101);
        panel.add(btnCinco);

        btnCinco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnCinco.getText() == " ") {
                    System.out.println("Esta vacio");


                    switch(textito) {
                        case 1:
                            System.out.println("El 10 funciono: "+textito);
                            btnUno.setText(" ");//AQUI VA EL SWITCH
                            btnCinco.setText(textoGuardado); //BOTON BTN (INSERTE NUMERO)
                            break;
                        case 6:
                            System.out.println("El 6 funciono: "+textito);
                            btnSeis.setText(" "); //AQUI VA EL SWITCH
                            btnCinco.setText(textoGuardado); //BOTON BTN (INSERTE NUMERO)
                            break;
                        case 9:
                            System.out.println("El 5 funciono: "+textito);
                            btnNueve.setText(" ");//AQUI VA EL SWITCH
                            btnCinco.setText(textoGuardado); //BOTON BTN (INSERTE NUMERO)
                            break;
                    }


                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 5;
                    textoGuardado = btnCinco.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });

        btnSeis = new JButton("");
        btnSeis.setBackground(new Color(255, 255, 255));
        btnSeis.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnSeis.setBounds(133, 137, 98, 101);
        panel.add(btnSeis);

        btnSeis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnSeis.getText() == " ") {
                    System.out.println("Esta vacio");


                    switch(textito) {
                        case 2:
                            System.out.println("El 2 funciono: "+textito);
                            btnDos.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNONCE, ES EL DEL BOTON)
                            btnSeis.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (12)
                            break;
                        case 5:
                            System.out.println("El 5 funciono: "+textito);
                            btnCinco.setText(" ");
                            btnSeis.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 7:
                            System.out.println("El 7 funciono: "+textito);
                            btnSiete.setText(" ");
                            btnSeis.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 10:
                            System.out.println("El 10 funciono: "+textito);
                            btnDiez.setText(" ");
                            btnSeis.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                    }


                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 6;
                    textoGuardado = btnSeis.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });

        btnSiete = new JButton("");
        btnSiete.setBackground(new Color(255, 255, 255));
        btnSiete.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnSiete.setBounds(241, 137, 98, 101);
        //btnSiete.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnSiete);

        btnSiete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnSiete.getText() == " ") {
                    System.out.println("Esta vacio");


                    switch(textito) {
                        case 8:
                            System.out.println("El 12 funciono: "+textito);
                            btnOcho.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNONCE, ES EL DEL BOTON)
                            btnSiete.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (12)
                            break;
                        case 11:
                            System.out.println("El 11 funciono: "+textito);
                            btnOnce.setText(" ");
                            btnSiete.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 6:
                            System.out.println("El 7 funciono: "+textito);
                            btnSeis.setText(" ");
                            btnSiete.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 3:
                            System.out.println("El 7 funciono: "+textito);
                            btnTres.setText(" ");
                            btnSiete.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                    }



                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 7;
                    textoGuardado = btnSiete.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });

        btnOcho = new JButton("");
        btnOcho.setBackground(new Color(255, 255, 255));
        btnOcho.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnOcho.setBounds(349, 137, 98, 101);
        //btnOcho.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnOcho);

        btnOcho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnOcho.getText() == " ") {
                    System.out.println("Esta vacio");


                    switch(textito) {
                        case 12:
                            System.out.println("El 12 funciono: "+textito);
                            btnDoce.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnOcho.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (12)
                            break;
                        case 7:
                            System.out.println("El 7 funciono: "+textito);
                            btnSiete.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnOcho.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 4:
                            System.out.println("El 4 funciono: "+textito);
                            btnCuatro.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnOcho.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                    }



                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 8;
                    textoGuardado = btnOcho.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });

        btnNueve = new JButton("");
        btnNueve.setBackground(new Color(255, 255, 255));
        btnNueve.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnNueve.setBounds(24, 248, 98, 101);
        //btnNueve.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnNueve);

        btnNueve.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(btnNueve.getText() == " ") {
                    System.out.println("Esta vacio");

                    switch(textito) {
                        case 10:
                            System.out.println("El 10 funciono: "+textito);
                            btnDiez.setText(" ");//AQUI VA EL SWITCH
                            btnNueve.setText(textoGuardado); //BOTON BTN (INSERTE NUMERO)
                            break;
                        case 13:
                            System.out.println("El 13 funciono: "+textito);
                            btnTrece.setText(" "); //AQUI VA EL SWITCH
                            btnNueve.setText(textoGuardado); //BOTON BTN (INSERTE NUMERO)
                            break;
                        case 5:
                            System.out.println("El 5 funciono: "+textito);
                            btnCinco.setText(" ");//AQUI VA EL SWITCH
                            btnNueve.setText(textoGuardado); //BOTON BTN (INSERTE NUMERO)
                            break;
                    }
                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 9;
                    textoGuardado = btnNueve.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });

        btnDiez = new JButton("");
        btnDiez.setBackground(new Color(255, 255, 255));
        btnDiez.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnDiez.setBounds(133, 248, 98, 101);
        //btnDiez.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnDiez);

        btnDiez.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnDiez.getText() == " ") {
                    System.out.println("Esta vacio");

                    switch(textito) {
                        case 11:
                            System.out.println("El 11 funciono: "+textito);
                            btnOnce.setText(" ");
                            btnDiez.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (11)
                            break;
                        case 14:
                            System.out.println("El 11 funciono: "+textito);
                            btnCatorce.setText(" ");
                            btnDiez.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (14)
                            break;
                        case 6:
                            System.out.println("El 11 funciono: "+textito);
                            btnSeis.setText(" ");
                            btnDiez.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (11)
                            break;
                        case 9:
                            System.out.println("El 11 funciono: "+textito);
                            btnNueve.setText(" ");
                            btnDiez.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (14)
                            break;
                    }

                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 10;
                    textoGuardado = btnDiez.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }

            }
        });

        btnOnce = new JButton("");
        btnOnce.setBackground(new Color(255, 255, 255));
        btnOnce.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnOnce.setBounds(241, 248, 98, 101);
        //btnOnce.setText(numeros[rand.nextInt(numeros.length)]);
        panel.add(btnOnce);

        btnOnce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnOnce.getText() == " ") {
                    System.out.println("Esta vacio");


                    switch(textito) {
                        case 12:
                            System.out.println("El 12 funciono: "+textito);
                            btnDoce.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNONCE, ES EL DEL BOTON)
                            btnOnce.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (12)
                            break;
                        case 15:
                            System.out.println("El 11 funciono: "+textito);
                            btnQuince.setText(" ");
                            btnOnce.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 7:
                            System.out.println("El 7 funciono: "+textito);
                            btnSiete.setText(" ");
                            btnOnce.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 10:
                            System.out.println("El 7 funciono: "+textito);
                            btnDiez.setText(" ");
                            btnOnce.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                    }


                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 11;
                    textoGuardado = btnOnce.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });

        btnDoce = new JButton("");
        btnDoce.setBackground(new Color(255, 255, 255));
        btnDoce.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnDoce.setBounds(349, 248, 98, 101);
        panel.add(btnDoce);

        btnDoce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnDoce.getText() == " ") {
                    System.out.println("Esta vacio");


                    switch(textito) {
                        case 16:
                            System.out.println("El 16 funciono: "+textito);
                            btnDiezYSeis.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnDoce.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (16)
                            break;
                        case 11:
                            System.out.println("El 11 funciono: "+textito);
                            btnOnce.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnDoce.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 8:
                            System.out.println("El 8 funciono: "+textito);
                            btnOcho.setText(" ");
                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnDoce.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                    }


                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 12;
                    textoGuardado = btnDoce.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });

        btnTrece = new JButton("");
        btnTrece.setBackground(new Color(255, 255, 255));
        btnTrece.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnTrece.setBounds(24, 359, 98, 101);
        panel.add(btnTrece);

        btnTrece.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnTrece.getText() == " ") {
                    System.out.println("Esta vacio");


                    switch(textito) {
                        case 14:
                            System.out.println("El 14 funciono: "+textito);
                            btnCatorce.setText(" ");

                            //RECUERDA QUE ESTE SIEMPRE (BTNTRECE, ES EL DEL BOTON)
                            btnTrece.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;

                        case 9:
                            System.out.println("El 9 funciono: "+textito);
                            btnNueve.setText(" ");
                            btnTrece.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (10)
                            break;

                    }


                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 13;
                    textoGuardado = btnTrece.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });

        btnCatorce = new JButton("");
        btnCatorce.setBackground(new Color(255, 255, 255));
        btnCatorce.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnCatorce.setBounds(133, 359, 98, 101);
        panel.add(btnCatorce);

        btnCatorce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnCatorce.getText() == " ") {
                    System.out.println("Esta vacio");


                    switch(textito) {
                        case 15:
                            System.out.println("El 15 funciono: "+textito);
                            btnQuince.setText(" ");

                            //RECUERDA QUE ESTE SIEMPRE (BTNCATORCE, ES EL DEL BOTON)
                            btnCatorce.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 10:
                            System.out.println("El 11 funciono: "+textito);
                            btnDiez.setText(" ");
                            btnCatorce.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (10)
                            break;
                        case 13:
                            System.out.println("El 13 funciono: "+textito);
                            btnTrece.setText(" ");
                            btnCatorce.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (10)
                            break;
                    }



                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 14;
                    textoGuardado = btnCatorce.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }

            }
        });

        btnQuince = new JButton("");
        btnQuince.setBackground(new Color(255, 255, 255));
        btnQuince.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnQuince.setBounds(241, 359, 98, 101);
        panel.add(btnQuince);

        btnQuince.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnQuince.getText() == " ") {
                    System.out.println("Esta vacio");


                    switch(textito) {
                        case 16:
                            System.out.println("El 16 funciono: "+textito);
                            btnDiezYSeis.setText(" ");
                            btnQuince.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (16)
                            break;
                        case 11:
                            System.out.println("El 11 funciono: "+textito);
                            btnOnce.setText(" ");
                            btnQuince.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (11)
                            break;
                        case 14:
                            System.out.println("El 14 funciono: "+textito);
                            btnCatorce.setText(" ");
                            btnQuince.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (14)
                            break;
                    }


                }else {
                    //ENVIAR DATOS
                    System.out.println("Si tiene numero");
                    textito = 15;
                    textoGuardado = btnQuince.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }

            }
        });

        btnDiezYSeis = new JButton("");
        btnDiezYSeis.setBackground(new Color(255, 255, 255));
        btnDiezYSeis.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnDiezYSeis.setBounds(349, 359, 98, 101);
        panel.add(btnDiezYSeis);

        JLabel lblNewLabel = new JLabel("Rompecabezas Numérico");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setBounds(196, 11, 182, 24);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("Reiniciar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inicializarTextoBotones();
                asignarTextosAleatorios();
            }
        });
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(210, 541, 143, 23);
        contentPane.add(btnNewButton);

        lblTiempo_1 = new JLabel("00:00");
        lblTiempo_1.setForeground(Color.WHITE);
        lblTiempo_1.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblTiempo_1.setBounds(593, 251, 75, 24);

        long startTime = System.currentTimeMillis();
        Timer timer = new Timer(1000, e -> {
            long elapsedTime = System.currentTimeMillis() - startTime;
            long minutos = TimeUnit.MILLISECONDS.toMinutes(elapsedTime);
            long segundos = TimeUnit.MILLISECONDS.toSeconds(elapsedTime) - TimeUnit.MINUTES.toSeconds(minutos);
            String tiempo = String.format("%02d:%02d", minutos, segundos);
            lblTiempo_1.setText(tiempo);
        });
        timer.start();

        contentPane.add(lblTiempo_1);

        lblTiempo = new JLabel("Tiempo");
        lblTiempo.setBounds(582, 197, 101, 43);
        contentPane.add(lblTiempo);
        lblTiempo.setForeground(Color.WHITE);
        lblTiempo.setFont(new Font("Tahoma", Font.PLAIN, 27));

        btnDiezYSeis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(btnDiezYSeis.getText() == " ") {
                    System.out.println("Esta vacio");

                    switch(textito) {
                        case 15:
                            System.out.println("El 15 funciono: "+textito);
                            btnQuince.setText(" ");
                            btnDiezYSeis.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (15)
                            break;
                        case 12:
                            System.out.println("El 12 funciono: "+textito);
                            btnDoce.setText(" ");
                            btnDiezYSeis.setText(textoGuardado); //RECIBIMOS EL NUMERO DEL BOTON PRESIONADO == (12)
                            break;
                    }
                }else {
                    //ENVIAMOS DATOS
                    System.out.println("Si tiene numero");
                    textito = 16;
                    textoGuardado = btnDiezYSeis.getText();
                    System.out.println(textito);
                    System.out.println(textoGuardado);
                }
            }
        });


        inicializarTextoBotones();
        asignarTextosAleatorios();

        confirmarGanador();


    }

    public void cambiar() {
        if(textito == 1) {
            btnUno.setText(" ");
        }

        if(!textoGuardado.isEmpty()) {
            System.out.println("Hola");
            btnDiezYSeis.setText(textoGuardado);
        }else if(textoGuardado.isEmpty()) {
            System.out.println("HOLITA");
        }
    }

	/*
	public void moverNumeroUno() {
		inicializarTextoBotones();
		btnUno.getText();
		System.out.println(btnUno.getText());
	}
	*/

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
        btnDiezYSeis.setText(textosDisponibles.get(15));
    }

    public void confirmarGanador(){
        if(btnUno.getText() == "1" && btnDos.getText() == "2" && btnTres.getText() == "3"
                && btnCuatro.getText() == "4"
                && btnCinco.getText() == "5"
                && btnSeis.getText() == "6"
                && btnSiete.getText() == "7"
                && btnOcho.getText() == "8"
                && btnNueve.getText() == "9"
                && btnDiez.getText() == "10"
                && btnOnce.getText() == "11"
                && btnDoce.getText() == "12"
                && btnTrece.getText() == "13"
                && btnCatorce.getText() == "14"
                && btnQuince.getText() == "15"
                && btnDiezYSeis.getText() == " "){

            JOptionPane.showMessageDialog(null, "HAS GANADO :D, FELICIDADES!");
            System.exit(0);

        }


    }
}