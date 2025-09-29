package example;

import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class AlexTest {

    @Test
    public void testGetFriends() throws Exception {
        Feline.Alex alex = new Feline.Alex();
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        Feline.Alex alex = new Feline.Alex();
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() throws Exception {
        Feline.Alex alex = new Feline.Alex();
        assertEquals(0, alex.getKittens()); // У Алекса нет львят
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Feline.Alex alex = new Feline.Alex();
        assertTrue(alex.doesHaveMane()); // Алекс самец, поэтому грива есть
    }
}