package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {


    @Test
    public void NewHeroGetsCorrectlyCreated_true() throws Exception{
        Hero hero = new Hero ("SpiderMan","infinite Webs","Love",24);
        assertEquals(true,hero instanceof Hero);
    }
    @Test
    public void HeroInstantiatesWithContent_True() throws Exception{
        Hero hero = new Hero("SpiderMan","infinite Webs","Love",24);
        assertEquals ("SpiderMan", hero.getName());
        assertEquals("infinite Webs",hero.getPowers());
        assertEquals(24,hero.getAge());
        assertEquals("Love",hero.getWeakness());
    }
}