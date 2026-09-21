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


public class AULA_RAFAEL_30_1 {
         public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        
        double[]notaAlunos = new double [255];
        ArrayList<Double> notas = new ArrayList<>();
     // Lê as notas de 50 alunos
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = entrada.nextDouble();
            notas.add(nota);
        }

        // Busca uma nota
        System.out.print("\nDigite a nota que deseja buscar: ");
        double busca = entrada.nextDouble();

        int indiceEncontrado = -1;

        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) == busca) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) {
            System.out.println("Nota encontrada na posição: " + indiceEncontrado);
        } else {
            System.out.println("Nota não encontrada.");
        }

        entrada.close();
    }
}