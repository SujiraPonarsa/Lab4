package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sqa.main.Ranking;

public class RankingRobustnessTest {

    private final Ranking ranking = new Ranking();

    @Test
    public void negativePurchaseTotal() {
        assertEquals("Standard", ranking.CalculateMembershipRank(-1, 2, 200));
    }

    @Test
    public void negativeFrequency() {
        assertEquals("Standard", ranking.CalculateMembershipRank(10000, -1, 200));
    }

    @Test
    public void negativePointCollected() {
        assertEquals("Standard", ranking.CalculateMembershipRank(20000, 2, -1));
    }

    @Test
    public void tooHighPurchaseTotal() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(1000000, 7, 1500));
    }

    @Test
    public void tooHighFrequency() {
        assertEquals("Standard", ranking.CalculateMembershipRank(150000, 8, 2000));
    }

    @Test
    void tooHighPointCollected() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(120000, 7, 100_000));
    }
    
    @Test
    public void allNegativeValues() {
        assertEquals("Standard", ranking.CalculateMembershipRank(-10000, -2, -300));
    }

    @Test
    public void allZeroValues() {
        assertEquals("Standard", ranking.CalculateMembershipRank(0, 0, 0));
    }

    @Test
    public void frequencyZeroPointsNegative() {
        assertEquals("Standard", ranking.CalculateMembershipRank(15000, 0, -10));
    }

    @Test
    public void frequencyHighPointsNegative() {
        assertEquals("Standard", ranking.CalculateMembershipRank(120000, 100, -10));
    }
    
    @Test
    public void allAbovePlatinum() {
        assertEquals("Standard", ranking.CalculateMembershipRank(200000, 20, 10_000));
    }
}