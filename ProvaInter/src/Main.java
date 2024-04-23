//package meuapp;

import Jogador.Jogador;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

public class Main extends JFrame {

    //atributos
    private JPanel painel = new JPanel();
    private JLabel jLabelMensagem1 = new JLabel("☛ BBB 2024 ☚");
    private JLabel jLabelMensagem = new JLabel("Em quem você vota para sair da casa? ");
    private JButton jButtonVotar = new JButton("✅ Votar");
    private JButton jButtonResultado = new JButton("Resultado");

    private JComboBox<String> jComboBox1 = new JComboBox<>(new String[]{"Alane Dias", "Beatriz Reis",
            "Davi Brito","Deniziane Ferreira," +
            "Fernanda Bande","Fernanda Bande","Giovanna Lima","Giovanna Pitel","Isabelle Nogueira",
    "Juninho", "Leidy Elin","Lucas Henrique","Lucas Luigi","Lucas Pizane","Marcus Vinicius",
    "Marcus Vinicius","Matteus Amaral","Maycon Cosmer","MC Bin Laden","Michel Nogueira",
            "Nizam","Raquele Cardozo","Rodriguinho","Thalyta Alves","Vanessa Lopes",
            "Vinicius Rodrigues","Wanessa Camargo","Yasmin Brunet"}); // Adicionando opções ao JComboBox


    //construtor
    public Main(){
        this.setTitle("BBB 2024");
        this.setSize(400,400);
        configurarComponentes();
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setVisible(true); // Exibir janela
    }

    private void configurarComponentes() {
        jButtonVotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNovaJanela();
            }
        });
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));
        painel.add(jLabelMensagem1);
        painel.add(jLabelMensagem);


        painel.add(jComboBox1);

        painel.add(jButtonVotar);
        painel.add(jButtonResultado);
        this.getContentPane().add(painel);

    }
    private void abrirNovaJanela() {
        String opcaoSelecionada = (String) jComboBox1.getSelectedItem();
        // Criando uma nova janela
        JFrame novaJanela = new JFrame("Nova Janela");
        novaJanela.setSize(300, 200);

        if (opcaoSelecionada.equals("Alane Dias")) {


        } else if (opcaoSelecionada.equals("")) {

        } else if (opcaoSelecionada.equals("")) {
        }

        // Configurando a nova janela
        novaJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fechar apenas a janela atual ao fechar
        novaJanela.setLocationRelativeTo(null);
        novaJanela.setVisible(true);
        novaJanela.setTitle("BBB 2024");// Exibir a nova janela
        novaJanela.setSize(400,260);
        novaJanela.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
    }
    public static void main(String[] args) {
        new Main();
    }
}