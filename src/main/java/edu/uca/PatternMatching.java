package edu.uca;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PatternMatching {
    public static boolean esNumeroEntero(String cadena) {
        return true;
    }

    @Test
    public void testEsNumeroEntero() {
        Assert.assertTrue(esNumeroEntero("12345"));
        Assert.assertFalse(esNumeroEntero("12a45"));
        Assert.assertFalse(esNumeroEntero(" 123 "));
        Assert.assertFalse(esNumeroEntero(""));
    }

    public static boolean validarTelefono(String telefono) {
        //formato = +, 2 digitos, guion, 4 digitos, guion, 6 digitos
        return telefono.matches("regex");
    }

    @Test
    public void testValidarTelefono() {
        Assert.assertTrue(validarTelefono("+34-1234-567890"));
        Assert.assertFalse(validarTelefono("34-1234-567890"));
        Assert.assertFalse(validarTelefono("+341234-567890"));
        Assert.assertFalse(validarTelefono("+34-123-567890"));
    }

    public static int contarPalabras(String texto) {
        if (texto.trim().isEmpty()) return 0;
        return texto.split("\\s+").length;
    }

    @Test
    public void testContarPalabras() {
        Assert.assertEquals(contarPalabras("Hola mundo"), 2);
        Assert.assertEquals(contarPalabras("Este es un test"), 4);
        Assert.assertEquals(contarPalabras(""), 0);
        Assert.assertEquals(contarPalabras("   "), 0);
    }

    public static String cambiarFormatoFecha(String texto) {
        return texto.replaceAll("", "$3-$2-$1");
    }

    @Test
    public void testCambiarFormatoFecha() {
        Assert.assertEquals(cambiarFormatoFecha("Hoy es 25/12/2023"), "Hoy es 2023-12-25");
        Assert.assertEquals(cambiarFormatoFecha("Fecha: 01/01/2000"), "Fecha: 2000-01-01");
        Assert.assertEquals(cambiarFormatoFecha("Sin fecha"), "Sin fecha");
    }

    public static Map<String, Long> contarDominiosCorreo(List<String> correos) {
        Pattern pattern = Pattern.compile("regex");

        return correos.stream()
                .map(correo -> {
                    var matcher = pattern.matcher(correo);
                    return matcher.find() ? matcher.group(1) : null;
                })
                .filter(<completar>)
                .collect(<completar>);
    }

    @Test
    public void testContarDominiosCorreo() {
        List<String> correos = Arrays.asList(
                "juan@mail.com", "pedro@gmail.com", "ana@mail.com",
                "carlos@yahoo.com", "maria@gmail.com", "test@mail.com"
        );

        Map<String, Long> resultado = contarDominiosCorreo(correos);

        Assert.assertEquals(resultado.get("mail.com"), Long.valueOf(3));
        Assert.assertEquals(resultado.get("gmail.com"), Long.valueOf(2));
        Assert.assertEquals(resultado.get("yahoo.com"), Long.valueOf(1));
    }
}
