package test;


import org.junit.jupiter.api.Test;

import sqa.main.Ranking;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RankingBoundaryTest {

    Ranking ranking = new Ranking();

    @Test
    public void testSilverLowerBoundary() {
        assertEquals("Silver", ranking.CalculateMembershipRank(10000, 2, 100));
    }

    @Test
    public void testSilverUpperBoundary() {
        assertEquals("Silver", ranking.CalculateMembershipRank(49999, 2, 499));
    }

    @Test
    public void testGoldLowerBoundary() {
        assertEquals("Gold", ranking.CalculateMembershipRank(50000, 5, 500));
    }

    @Test
    public void testGoldUpperBoundary() {
        assertEquals("Gold", ranking.CalculateMembershipRank(99999, 5, 999));
    }

    @Test
    public void testPlatinumLowerBoundary() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(100000, 6, 1000));
    }

    @Test
    public void testBelowAllBoundaries() {
        assertEquals("Standard", ranking.CalculateMembershipRank(9999, 1, 99));
    }
}

