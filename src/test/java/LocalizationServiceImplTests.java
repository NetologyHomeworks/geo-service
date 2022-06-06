import org.junit.jupiter.api.*;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTests {

    @BeforeEach
    public void init() {
        System.out.println("Test started");
    }

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("Test completed");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("Tests completed");
    }

    @Test
    public void testRusLocale() {
        String locale = new LocalizationServiceImpl().locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, locale);
    }

    @Test
    public void testEngLocale() {
        String locale = new LocalizationServiceImpl().locale(Country.USA);
        String expected = "Welcome";
        Assertions.assertEquals(expected, locale);
    }
}
