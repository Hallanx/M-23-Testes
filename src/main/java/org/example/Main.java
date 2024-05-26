package com.exemplo; // Certifique-se de que o pacote esteja correto

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<String> sexos = new ArrayList<>();

        System.out.println("Digite os nomes separados por vírgula (ex: Maria,Fernando,João): ");
        String input = scanner.nextLine();

        String[] nomesArray = input.split(",");
        for (String nome : nomesArray) {
            nome = nome.trim();
            nomes.add(nome);

            System.out.print("Digite o sexo de " + nome + " (M para masculino, F para feminino): ");
            String sexo = scanner.nextLine().trim().toLowerCase();
            sexos.add(sexo);
        }

        List<String> mulheres = com.exemplo.SeparadorPorSexo.separarMulheres(nomes, sexos);

        System.out.println("\n--- Grupo de Mulheres (em ordem alfabética) ---");
        mulheres.forEach(System.out::println);

        scanner.close();
    }
}