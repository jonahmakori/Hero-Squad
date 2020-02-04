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
}