import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest 
{
    @Test
    public void testLAppearsThreeTimessInHelloWorld()
    {
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("Hello world");
        //Act
        int actualCount = counter.getFrequency('l');
        //Assert
        assertEquals(3, actualCount);
    }

    @Test
    public void testNonOccuringCharacterPercentageIsZero()
    {
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi There");
        //Act
        double actualpercentage = counter.getRelativePercentage('z');
        //Assert
        assertEquals(0.0, actualpercentage,0.0001);  //last variable is "as long as it's withing the range of that decimal"
    }
}