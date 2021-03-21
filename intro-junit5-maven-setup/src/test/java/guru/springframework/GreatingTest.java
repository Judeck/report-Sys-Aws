package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreatingTest {

    @BeforeAll
    public static void beforeClass() {
        System.out.println("only call once");
    }

    Greating greating;
    @BeforeEach
    void setUp() {
        greating = new Greating();
    }

    @Test
    void helloWorld() {
        System.out.println(greating.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greating.helloWorld("kun"));
    }

    @Test
    void helloWorld2() {
        System.out.println(greating.helloWorld());
    }

    @Test
    void helloWorld3() {
        System.out.println(greating.helloWorld("kun"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("only one after");
    }

}