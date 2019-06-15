import org.junit.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromoTest {

    @Test
    public void palindromoTest() {
        getPalindromos().forEach(palindromo -> assertThat(new Palindromo().isPalindromo(palindromo)).isTrue());
    }

    @Test
    public void palindromoTest2() {
        getPalindromos().forEach(palindromo -> assertThat(new Palindromo().isPalindromo2(palindromo)).isTrue());
    }

    private static Stream<String> getPalindromos() {
        return Stream.of(
                "o teu dueto",
                "a mae te ama",
                "apos a sopa",
                "megabobagem",
                "ame o poema",
                "oto come mocoto",
                "a torre da derrota",
                "rir o breve verbo rir",
                "anotaram a data da maratona"
        );
    }
}
