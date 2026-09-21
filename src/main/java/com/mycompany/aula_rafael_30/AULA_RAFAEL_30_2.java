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

public class AULA_RAFAEL_30_2 {
        public static void main(String[] args) {
    
            Scanner entrada = new Scanner(System.in);
            ArrayList<Double> notas = new ArrayList<>();

        // Lendo a nota dos alunos
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota do Aluno " + i + ": ");
            double nota = entrada.nextDouble();
            notas.add(nota);
        }

        // Exibindo as notas armazenadas
        System.out.println("\n=== NOTAS DOS ALUNOS ===");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas.get(i));
        }

        // Buscando uma nota
        System.out.print("\nDigite a nota que deseja buscar: ");
        double busca = entrada.nextDouble();

        ArrayList<Integer> posicoesEncontradas = new ArrayList<>();

        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) == busca) {
                posicoesEncontradas.add(i);
            }
        }

        if (posicoesEncontradas.size() > 0) {
            System.out.println("Nota encontrada nas posições: " + posicoesEncontradas);
            System.out.print("Alunos: ");
            for (int i = 0; i < posicoesEncontradas.size(); i++) {
                System.out.print("Aluno " + (posicoesEncontradas.get(i) + 1));
                if (i < posicoesEncontradas.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Nota não encontrada.");
        }

        entrada.close();
    }
}