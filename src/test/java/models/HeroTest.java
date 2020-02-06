package models;

import org.junit.After;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class HeroTest {
    public Hero setupNewHero(){
        return new Hero("SpiderMan","infinite Webs","Love",24,"Rangers");
    }

    @After
    public void tearDown() {Hero.clearAllHeros();}

    @Test
    public void NewHeroGetsCorrectlyCreated_true() {
        Hero hero = new Hero ("SpiderMan","infinite Webs","Love",24,"Rangers");
        assertEquals(true,hero instanceof Hero);
    }
    @Test
    public void HeroInstantiatesWithProperties_True() {
        Hero hero = new Hero("SpiderMan","infinite Webs","Love",24,"Rangers");
        assertEquals ("SpiderMan", hero.getName());
        assertEquals("infinite Webs",hero.getPowers());
        assertEquals(24,hero.getAge());
        assertEquals("Love",hero.getWeakness());
    }
    @Test
    public void EachHeroIsCorrectlyAdded_true(){
        Hero hero = new Hero("SpiderMan","infinite Webs","Love",24,"Rangers");
        Hero otherHero = new Hero("Dracula","Time Clock","Dimension",600,"Rangers");
        assertEquals(2,Hero.getNumberOfHeros().size());
    }
    @Test
    public void EachHeroAddedIsPresent_true(){
        Hero hero = new Hero("SpiderMan","infinite Webs","Love",24,"Rangers");
        Hero otherHero = new Hero("Dracula","Time Clock","Dimension",600,"Rangers");
        assertTrue(Hero.getNumberOfHeros().contains(hero));
        assertTrue(Hero.getNumberOfHeros().contains(otherHero));
    }
    @Test
    public void getAdded_isFalseAfterInstantiation() {
        Hero hero = new Hero("SpiderMan","infinite Webs","Love",24,"Rangers");
        assertEquals(false,hero.getAdded());
    }
    @Test
    public void getId_HeroInstatiatesWithAnID_1() {
        Hero.clearAllHeros();
        Hero myHero = new Hero("SpiderMan","infinite Webs","Love",24,"Rangers");
        assertEquals(1,myHero.getId());
    }
    @Test
    public void findReturnsCorrectHero() {
        Hero hero = setupNewHero();
        assertEquals(1, Hero.findById(hero.getId()).getId());
    }
    @Test
    public void findReturnsCorrectPostWhenMoreThanOneHeroExists() {
        Hero hero = setupNewHero();
        Hero otherHero = new Hero("SpiderMan","infinite Webs","Love",24,"Rangers");
        assertEquals(2, Hero.findById(otherHero.getId()).getId());
    }
    @Test
    public void updateChangesHeroContent() {
        Hero hero = setupNewHero();

        LocalDateTime formerDate = hero.getCreatedAt();
        int formerId = hero.getId();

//        Hero.update("SpiderMan","infinite Webs","Love",24);

        assertEquals(formerId, hero.getId());
        assertEquals(formerDate, hero.getCreatedAt());


    }

}