package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sqa.main.Ranking;

public class RankingRobustnessTest {

    private final Ranking ranking = new Ranking();

    @Test
    public void TC1() {
        assertEquals("Invalid", ranking.CalculateMembershipRank(-1, 15, 500));
    }

    @Test
    public void TC2() {
        assertEquals("Standard", ranking.CalculateMembershipRank(0, 15, 500));
    }

    @Test
    public void TC3() {
        assertEquals("Standard", ranking.CalculateMembershipRank(1, 15, 500));
    }

    @Test
    public void TC4() {
        assertEquals("Gold", ranking.CalculateMembershipRank(50000, 15, 500));
    }

    @Test
    public void TC5() {
        assertEquals("Gold", ranking.CalculateMembershipRank(99999, 15, 500));
    }

    @Test
    void TC6() {
        assertEquals("Gold", ranking.CalculateMembershipRank(100000, 15, 5000));
    }
    
    @Test
    public void TC7() {
        assertEquals("Silver", ranking.CalculateMembershipRank(100001, 15, 500));
    }

    @Test
    public void TC8() {
        assertEquals("Silver", ranking.CalculateMembershipRank(50000, 0, 500));
    }
    @Test
    public void TC9() {
        assertEquals("Silver", ranking.CalculateMembershipRank(50000, 1, 500));
    }

    @Test
    public void TC10() {
        assertEquals("Silver", ranking.CalculateMembershipRank(50000, 2, 500));
    }

    @Test
    public void TC11() {
        assertEquals("Gold", ranking.CalculateMembershipRank(50000, 30, 500));
    }
    @Test 
    public void TC12()       { 
    	assertEquals("Gold", ranking.CalculateMembershipRank(50000, 31, 500)); 
    }
    @Test public void TC13()   { 
    	assertEquals("Gold", ranking.CalculateMembershipRank(50000, 32, 500));
    
    }
    @Test 
    public void TC14()        { 
    	assertEquals("Invalid", ranking.CalculateMembershipRank(50000, 15, -1)); 
    }
    @Test 
    public void TC15()    {
    	assertEquals("Standard", ranking.CalculateMembershipRank(50000, 15, 0)); 
    }
    @Test 
    public void TC16()    { 
    	assertEquals("Standard", ranking.CalculateMembershipRank(50000, 15, 1)); 
    } 
    @Test 
    public void TC17()   {
    	assertEquals("Gold", ranking.CalculateMembershipRank(50000, 15, 999)); 
    }
    @Test 
    public void TC18()        {
    	assertEquals("Gold", ranking.CalculateMembershipRank(50000, 15, 1000)); 
    }
    @Test 
    public void TC19()    { 
    	assertEquals("Gold", ranking.CalculateMembershipRank(50000, 15, 1001)); 
    }
}
