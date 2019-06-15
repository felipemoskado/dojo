import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Palindromo {

    public boolean isPalindromo(String texto) {
        List<Character> chars = texto.replaceAll(" ", "").chars().mapToObj(c -> (char) c).collect(toList());
        LinkedList palindromo = new LinkedList<>(chars);

        while (palindromo.size() > 1) {
            if (!palindromo.pollFirst().equals(palindromo.pollLast()))
                return false;
        }

        return true;
    }

    public boolean isPalindromo2(String texto) {
        texto = texto.replaceAll(" ", "");
        char[] chars = texto.toCharArray();
        StringBuilder reverse = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--)
            reverse.append(chars[i]);

        return reverse.toString().equals(texto);
    }
}
