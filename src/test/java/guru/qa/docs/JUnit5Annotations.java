package guru.qa.docs;

import org.junit.jupiter.api.*;

public class JUnit5Annotations {

    @BeforeAll
    static void beforeAll() {
        System.out.println("this is before all methods!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("this is before each method!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("this is after each method!");
    }

    @AfterAll
    static void tearDownDown() {
        System.out.println("this is after all methods!");
    }

    @Test
    void firstTest() {
        System.out.println("this is the first @test!");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        System.out.println("this is the second @test!");
        Assertions.assertTrue(true);
    }
}