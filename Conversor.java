public class Conversor {
    public static String numeroParaTexto(int numero) {
        return new String[]{"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove"}[numero];
    }

    public static void main(String[] args) {
        System.out.println(numeroParaTexto(3));
    }
}

