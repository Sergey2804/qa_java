package example;

import com.example.Animal;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void testGetFoodForHerbivore() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood = Arrays.asList("Трава", "Различные растения");
        assertEquals(expectedFood, animal.getFood("Травоядное"));
    }

    @Test
    public void testGetFoodForPredator() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, animal.getFood("Хищник"));
    }

    @Test(expected = Exception.class)
    public void testGetFoodForUnknownAnimal() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Неизвестный вид");
    }

    @Test
    public void testGetFoodExceptionMessage() {
        Animal animal = new Animal();
        try {
            animal.getFood("Неизвестный вид");
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }
}