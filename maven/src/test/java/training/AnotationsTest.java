package training;

import org.junit.jupiter.api.*;

public class AnotationsTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll Выполняется 1 раз перед всеми тестами");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Каждый раз перед тестом выполняется");

    }
@Disabled("комеент почему не выполняется тест")
    @Test
    public void test() {
        System.out.println("Сам test");
    }
@DisplayName("Тест 2")
    @Test
    public void test2() {
        System.out.println("Сам test2");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Выполняется после");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterall выполняется 1 раз после всех тестов");
    }

    @Nested
    public class InnerClassTest {
        @Test
        public void test22() {
            System.out.println("Сам test22 inner тест из внутреннего класса");
        }
    }
}