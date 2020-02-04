package models;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    public void NewHeroGetsCorrectlyCreated_true() throws Exception{
        Hero hero = new Hero ("Hero 1 : SpiderMan");
        assertEquals(true,hero instanceof Hero)
    }
}