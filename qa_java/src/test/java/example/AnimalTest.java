package example;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void testGetFoodForHerbivore() throws Exception {
        List<String> expectedFood = Arrays.asList("Трава", "Различные растения");
        assertEquals(expectedFood, animal.getFood("Травоядное"));
    }

    @Test
    public void testGetFoodForPredator() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, animal.getFood("Хищник"));
    }

    @Test
    public void testGetFoodForUnknownType() {
        try {
            animal.getFood("Всеядное");
            org.junit.Assert.fail("Expected exception");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

    @Test
    public void testGetFamily() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }
}