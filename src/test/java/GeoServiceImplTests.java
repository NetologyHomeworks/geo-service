import org.junit.jupiter.api.*;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTests {
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
    public void testRusLocationByIp() {
        Location location = new GeoServiceImpl().byIp(GeoServiceImpl.MOSCOW_IP);
        Assertions.assertEquals("Moscow", location.getCity());
    }

    @Test
    public void testEngLocationByIp() {
        Location location = new GeoServiceImpl().byIp(GeoServiceImpl.NEW_YORK_IP);
        Assertions.assertEquals("New York", location.getCity());
    }
}
