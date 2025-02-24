package edu.uca;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JavaStreams {
    public static List<Integer> filtrarParesOrdenados(List<Integer> numeros) {
        return numeros.stream()
                .filter(<completar>)
                .sorted(<completar>)
                .collect(<completar>);
    }

    @Test
    public void testFiltrarParesOrdenados() {
        List<Integer> input = Arrays.asList(10, 3, 7, 2, 8, 15, 6, 1);
        List<Integer> expected = Arrays.asList(10, 8, 6, 2);
        Assert.assertEquals(filtrarParesOrdenados(input), expected);
    }

    public static List<String> convertirMayusculasUnicas(List<String> nombres) {
        return nombres;
    }

    @Test
    public void testConvertirMayusculasUnicas() {
        List<String> input = Arrays.asList("Ana", "Pedro", "Juan", "Ana", "Carlos", "Pedro");
        List<String> expected = Arrays.asList("ANA", "PEDRO", "JUAN", "CARLOS");
        Assert.assertEquals(convertirMayusculasUnicas(input), expected);
    }

    public static int sumaCuadradosImpares(List<Integer> numeros) {
        // numeros impares: n % 2 != 0
        // cuadrado: n * n
        return numeros.stream().reduce(0, Integer::sum);
    }

    @Test
    public void testSumaCuadradosImpares() {
        Assert.assertEquals(sumaCuadradosImpares(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)), 165);
    }

    public static double promedioEdades(List<Persona> personas) {

        return personas.size();
    }

    @Test
    public void testPromedioEdades() {
        List<Persona> personas = Arrays.asList(
                new Persona("Ana", 25),
                new Persona("Pedro", 30),
                new Persona("Juan", 35),
                new Persona("Carlos", 40)
        );
        Assert.assertEquals(promedioEdades(personas), 32.5);
    }

    public static Map<Integer, List<String>> agruparPorLongitud(List<String> palabras) {
        return palabras.stream();
    }

    @Test
    public void testAgruparPorLongitud() {
        List<String> palabras = Arrays.asList("casa", "sol", "programación", "java", "cielo", "nube");
        Map<Integer, List<String>> resultado = agruparPorLongitud(palabras);

        Assert.assertEquals(resultado.get(3), Arrays.asList("sol"));
        Assert.assertEquals(resultado.get(4), Arrays.asList("casa", "java", "nube"));
        Assert.assertEquals(resultado.get(5), Arrays.asList("cielo"));
        Assert.assertEquals(resultado.get(12), Arrays.asList("programación"));
    }
}
