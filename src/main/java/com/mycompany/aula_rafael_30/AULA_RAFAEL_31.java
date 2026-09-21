package com.mycompany.aula_rafael_30;


import java.util.Scanner; // Lê dados do teclado/arquivo (entrada do usuário)
//import java.util.ArrayList; // Lista dinâmica que cresce automaticamente
//import java.util.HashMap; // Mapa chave→valor, acesso rápido por chave
//import java.util.Map; // Interface base para mapas como HashMap e TreeMap
//import java.util.Date; // Representa uma data e hora específicas
//import java.text.SimpleDateFormat; // Formata e analisa datas no formato desejado
//import java.util.Random; // Gera números pseudoaleatórios
//import java.util.Arrays; // Utilitários para trabalhar com arrays (ordenar, buscar, comparar)
//import java.util.Collections; // Operações prontas para coleções (ordenar, embaralhar, máximo/mínimo)
//import java.math.BigDecimal; // Números decimais com precisão exata (evita erros de ponto flutuante)
//import java.io.IOException; // Exceção para erros de entrada e saída (leitura/escrita de arquivos)

public class AULA_RAFAEL_31 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numAlunos = 5;
        double[] notaAluno = new double[numAlunos];

        // Lê as notas dos 5 alunos
        for (int i = 0; i < numAlunos; ++i) {
            System.out.print("Digite a nota do Aluno " + (i + 1) + ": ");
            notaAluno[i] = entrada.nextDouble();
        }

        // Exibe as notas armazenadas
        System.out.println("\n=== NOTAS DOS ALUNOS ===");
        for (int i = 0; i < notaAluno.length; ++i) {
            System.out.println("Aluno " + (i + 1) + ": " + notaAluno[i]);
        }

        // Busca por uma nota repetida
        System.out.print("\nDigite a nota que deseja buscar: ");
        double busca = entrada.nextDouble();

        boolean encontrou = false;
        System.out.print("Nota encontrada na(s) posição(ões): ");

        for (int i = 0; i < notaAluno.length; i++) {
            if (notaAluno[i] == busca) {
                System.out.print(i + " ");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma nota encontrada.");
        } else {
            System.out.println(); // pula linha
        }

        entrada.close();
    }
}
