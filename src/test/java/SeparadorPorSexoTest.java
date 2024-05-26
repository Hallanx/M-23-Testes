package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class SeparadorPorSexoTest {

    @Test
    public void testSepararMulheres() {
        List<String> nomes = Arrays.asList("Maria", "Fernando", "João", "Ana", "Paulo");
        List<String> sexos = Arrays.asList("f", "m", "m", "f", "m");

        List<String> expectedMulheres = Arrays.asList("Ana", "Maria");
        List<String> actualMulheres = com.exemplo.SeparadorPorSexo.separarMulheres(nomes, sexos);

        assertEquals(expectedMulheres, actualMulheres);
    }
}