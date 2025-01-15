package info.dmerej;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
 

public class RoverTest {  

    @ParameterizedTest
    @CsvFileSource(resources="./csv/movingForward.csv", numLinesToSkip=1 ) 
    void movingForwardTest(int x,int y, String direction,int expectedX, int expectedY){
        Rover rover = new Rover(x, y, direction);

        // When the rover moves forward
        rover.moveForward(rover.position.direction);

        // Then the rover should be at position (0, 1) facing North
        assertEquals(expectedX, rover.getX());
        assertEquals(expectedY, rover.getY());
    }

    @ParameterizedTest
    @CsvFileSource(resources="./csv/movingBackward.csv", numLinesToSkip=1 ) 

    void movingBackwardTest(int x, int y, String direction, int expectedX, int expectedY) {
        // Given a rover at position (x, y)
        Rover rover = new Rover(x, y, direction);

        // When the rover moves backward
        rover.moveBackward(rover.position.direction);

        // Then the rover should be at the expected position
        assertEquals(expectedX, rover.getX());
        assertEquals(expectedY, rover.getY());
    }

}
