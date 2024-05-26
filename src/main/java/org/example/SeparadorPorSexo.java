package com.exemplo;

import java.util.List;
import java.util.stream.Collectors;

public class SeparadorPorSexo {
    public static List<String> separarMulheres(List<String> nomes, List<String> sexos) {
        return nomes.stream()
                .filter(nome -> {
                    int index = nomes.indexOf(nome);
                    String sexo = sexos.get(index).trim().toLowerCase();
                    return sexo.equals("f");
                })
                .sorted()
                .collect(Collectors.toList());
    }
}
