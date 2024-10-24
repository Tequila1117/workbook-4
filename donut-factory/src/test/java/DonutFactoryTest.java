import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DonutFactoryTest {

    @org.junit.jupiter.api.Test
    void getPriceOfDonuts_MoreThan6Dozen_get_30_percent_discount() {

        // Fixed values for this test
        int sixDozen = 72;
        double costPerSixDozen = 25.2;
        double unitPricePerDonut = .50;

        // Arrange the test object(s)
        DonutFactory df = new DonutFactory(unitPricePerDonut);

        // Act on the object(s)
        double result = df.getPriceOfDonuts(sixDozen);

        // Assert what SHOULD happen
        assertEquals(costPerSixDozen, result, .001);

    }

    @Test
    void getPriceOfDonuts_0_to_5_donuts_no_discount() {

        // Fixed values for this test
        int three = 3;
        double costForThreeDonuts = 1.50;
        double unitPricePerDonut = .50;

        // Arrange the test object(s)
        DonutFactory df = new DonutFactory(unitPricePerDonut);

        // Act on the object(s)
        double result = df.getPriceOfDonuts(three);

        // Assert what SHOULD happen
        assertEquals(costForThreeDonuts, result);

    }

    @Test
    void getPriceOfDonuts_multiple_dozens_get_20_percent_discount() {

        // Fixed values for this test
        int twentyFour = 72;
        double costForTwoDozenDonuts = 25.2;
        double unitPricePerDonut = .50;

        // Arrange the test object(s)
        DonutFactory df = new DonutFactory(unitPricePerDonut);

        // Act on the object(s)
        double result = df.getPriceOfDonuts(twentyFour);

        // Assert what SHOULD happen
        assertEquals(costForTwoDozenDonuts, result, .001);

    }
}