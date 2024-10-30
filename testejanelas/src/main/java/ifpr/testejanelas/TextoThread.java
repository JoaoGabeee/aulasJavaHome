/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifpr.testejanelas;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author IFPR
 */
public class TextoThread extends Thread {

    private Random gerador;
    private Janela6 janela6;
    private List<String> mensagens;

    public TextoThread(Janela6 janela6) {
        gerador = new Random();
        this.janela6 = janela6;
        mensagens = new ArrayList<>();
        mensagens.add("ola tudo bem");
        mensagens.add("oi xuxu");
        mensagens.add("sera que vai chover?");
        mensagens.add("estou com fome");
        mensagens.add("amanhã é quinta");
        mensagens.add("não durma na aula");
        mensagens.add("engraçadinho");
        mensagens.add("kkkkkkkkkkkkkkkkkkkk");
        mensagens.add("Tchau!");
    }

    public void run() {

        try {
            int contador = 0;
            while (true) {
                this.sleep(800);
                if (contador == mensagens.size()) {
                    contador = 0;

                }
                janela6.setTextoLabel(mensagens.get(contador));
                int red = gerador.nextInt(256);
                int green = gerador.nextInt(256);
                int blue = gerador.nextInt(256);

                Color cor = new Color(red, green, blue);
                janela6.setCorLabel(cor);
                contador++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
