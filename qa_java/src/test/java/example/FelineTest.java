package example;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {

    private final int expectedKittens;
    private final int kittensCount;

    public FelineTest(int expectedKittens, int kittensCount) {
        this.expectedKittens = expectedKittens;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {1, 1},
                {3, 3},
                {5, 5},
                {0, 0}
        };
    }

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensWithoutParameters() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithParameters() {
        Feline feline = new Feline();
        assertEquals(expectedKittens, feline.getKittens(kittensCount));
    }
}