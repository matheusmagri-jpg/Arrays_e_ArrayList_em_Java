package com.mycompany.aula_rafael_30;

import java.util.Scanner; // Lê dados do teclado/arquivo (entrada do usuário)
import java.util.ArrayList; // Lista dinâmica que cresce automaticamente
//import java.util.HashMap; // Mapa chave→valor, acesso rápido por chave
//import java.util.Map; // Interface base para mapas como HashMap e TreeMap
//import java.util.Date; // Representa uma data e hora específicas
//import java.text.SimpleDateFormat; // Formata e analisa datas no formato desejado
//import java.util.Random; // Gera números pseudoaleatórios
//import java.util.Arrays; // Utilitários para trabalhar com arrays (ordenar, buscar, comparar)
//import java.util.Collections; // Operações prontas para coleções (ordenar, embaralhar, máximo/mínimo)
//import java.math.BigDecimal; // Números decimais com precisão exata (evita erros de ponto flutuante)
//import java.io.IOException; // Exceção para erros de entrada e saída (leitura/escrita de arquivos)

public class AULA_RAFAEL_30_4 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
        int numAlunos = 5;
        double[] notaAluno = new double[numAlunos];

        notaAluno[0] = 6.7;
        notaAluno[1] = 5.7;
        notaAluno[2] = 7.8;

        System.out.println(notaAluno[2]);
    }
}
