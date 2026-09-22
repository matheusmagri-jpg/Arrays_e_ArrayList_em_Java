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

public class AULA_RAFAEL_32 {
    
       public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numAlunos = 5;
        double[] notaAluno = new double[numAlunos];

        //Tipo	Tamanho	Faixa de valores
        //byte	 8 bits (1 byte)	-128 até 127
        //short	 16 bits (2 bytes)	-32.768 até 32.767
        //int	 32 bits (4 bytes)	-2.147.483.648 até 2.147.483.647
        //long	 64 bits (8 bytes)	-9.223.372.036.854.775.808 até 9.223.372.036.854.775.807
        //Tipo	Tamanho	Precisão
        //float  32 bits (4 bytes)	~7 dígitos decimais
        //double 64 bits (8 bytes)	~15 dígitos decimais

        
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
        
        

        //length é um atributo (não método!) que retorna o tamanho de um array — ou seja, quantas posições ele tem.
        
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

