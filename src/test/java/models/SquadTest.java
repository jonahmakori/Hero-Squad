package models;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class SquadTest {
    @Test
    public void squadInstance()throws Exception{
        Squad testSquad = new Squad("Marvel","Kill all",1,1);
        assertEquals(true,testSquad instanceof Squad);
    }

    @Test
    public void checkTheSquadSize()throws Exception{
        Squad testSize = new Squad("Marvel","Kill all",2,1);
        assertEquals(2,testSize.getSize() );
    }


    @Test
    public void squadInstanceOfId() throws Exception{
        Squad testSquadId = new Squad("Rangers","DestroyAll",1,2);
        assertEquals(2,testSquadId.getId());
    }
    @Test
    public void setSize() {
        Squad testSize = new Squad("Marvel","Kill all",2,1);
        assertEquals(2,testSize.getSize() );
    }

    @Test
    public void getMission() {
        Squad testMission = new Squad("Marvel","Kill all",1,1);
        assertEquals("Kill all",testMission.getMission());
    }

    @Test
    public void setMission() {
        Squad testMission = new Squad("Marvel","Kill all",1,1);
        assertEquals("Kill all",testMission.getMission());
    }

    @Test
    public void getName() {
        Squad testName = new Squad("Marvel","Kill all",1,1);
        assertEquals("Marvel",testName.getName());
    }

    @Test
    public void setName() {
        Squad squad = new Squad("Marvel","Kill all",1,1);
        assertEquals("Marvel",squad.getName());
    }

    @Test
    public void getId() {
    }
}