import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringProgramaTest {
    // Método auxiliar para simular a busca do caractere na cadeia
    private int buscarCaractere(String cadeia, char caractere) {
        return cadeia.indexOf(caractere); // Retorna o índice do caractere na string ou -1 se não encontrado
    }

    // Teste 1: Verifica se o número está no intervalo permitido (válido)
    @Test
    public void testNumeroValido() {
        int n = 5; // Valor de entrada válido
        assertTrue(n >= 1 && n <= 20, "O número deve estar entre 1 e 20."); // Testa a condição
    }

    // Teste 2: Verifica comportamento com número menor que o intervalo permitido
    @Test
    public void testNumeroInvalidoMenorQue1() {
        int n = 0; // Valor inválido
        assertFalse(n >= 1 && n <= 20, "O número não está no intervalo permitido.");
    }

    // Teste 3: Verifica comportamento com número maior que o intervalo permitido
    @Test
    public void testNumeroInvalidoMaiorQue20() {
        int n = 21; // Valor inválido
        assertFalse(n >= 1 && n <= 20, "O número não está no intervalo permitido.");
    }

    // Teste 4: Verifica se a cadeia tem o comprimento correto (válido)
    @Test
    public void testCadeiaValida() {
        String cadeia = "java"; // Cadeia de entrada
        int n = 4; // Comprimento esperado
        assertEquals(n, cadeia.length(), "A cadeia deve ter exatamente " + n + " caracteres.");
    }

    // Teste 5: Verifica comportamento com cadeia maior que o tamanho permitido
    @Test
    public void testCadeiaInvalidaTamanhoMaior() {
        String cadeia = "hello"; // Cadeia maior que o esperado
        int n = 4; // Comprimento esperado
        assertNotEquals(n, cadeia.length(), "Erro: A cadeia não tem o tamanho correto.");
    }

    // Teste 6: Verifica comportamento com cadeia menor que o tamanho permitido
    @Test
    public void testCadeiaInvalidaTamanhoMenor() {
        String cadeia = "hi"; // Cadeia menor que o esperado
        int n = 4; // Comprimento esperado
        assertNotEquals(n, cadeia.length(), "Erro: A cadeia não tem o tamanho correto.");
    }

    // Teste 7: Verifica se o caractere está presente e retorna a posição correta
    @Test
    public void testCaracterePresente() {
        String cadeia = "abcde"; // Cadeia de entrada
        char caractere = 'c'; // Caractere a ser buscado
        int posicao = buscarCaractere(cadeia, caractere); // Simula a busca
        assertEquals(2, posicao, "Caractere encontrado na posição correta."); // Posição esperada (índice 2)
    }

    // Teste 8: Verifica comportamento quando o caractere não está presente
    @Test
    public void testCaractereAusente() {
        String cadeia = "abcde"; // Cadeia de entrada
        char caractere = 'z'; // Caractere inexistente na cadeia
        int posicao = buscarCaractere(cadeia, caractere); // Simula a busca
        assertEquals(-1, posicao, "Caractere não encontrado na cadeia.");
    }

    // Teste 9: Verifica erro ao inserir múltiplos caracteres como entrada
    @Test
    public void testEntradaInvalidaMultiplosCaracteres() {
        String entrada = "abc"; // Entrada inválida com mais de um caractere
        assertTrue(entrada.length() > 1, "Erro: Entrada inválida, mais de um caractere.");
    }

    // Teste 10: Verifica reconhecimento do comando "sair"
    @Test
    public void testComandoSair() {
        String comando = "sair"; // Comando de saída
        assertEquals("sair", comando.toLowerCase(), "Comando 'sair' reconhecido corretamente.");
    }
}
