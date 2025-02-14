package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    private Calc calc;

    public CalcTest() {
        System.out.println("Constructor");
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("@BeforeAll");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("@AfterAll");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("@BeforeEach");
        this.calc = new Calc();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("@AfterEach");
    }

    @Test
    @DisplayName("テスト１")
    public void testSomeMethod1() {
        System.out.println("@Test(1)");
        assertEquals("odd", calc.evenOrOdd(1));
    }

    @Test
    @DisplayName("テスト２")
    public void testSomeMethod2() {
        System.out.println("@Test(2)");
        assertEquals("even", calc.evenOrOdd(2));
    }
}
