package aula02exm02;

import javax.swing.JFrame;

public class Aula02Exm02 {

    public static void main(String[] args) {
        JanelaTexto janela = new JanelaTexto();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(200,300);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

}
