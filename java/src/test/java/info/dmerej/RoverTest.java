package info.dmerej;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RoverTest {  

    @ParameterizedTest
    @CsvSource({
        "0, 0, north, 0, 1",
        "0, 0, south, 0,-1",
        "0, 0, east,  1, 0",
        "0, 0, west, -1, 0"
    })
    void movingForwardTest(int x, int y, String direction, int expectedX, int expectedY) {
        // Given a rover at position (x, y)
        Rover rover = new Rover(x, y, direction);

        // When the rover moves forward
        rover.moveForward(rover.position.direction);

        // Then the rover should be at the expected position
        assertEquals(expectedX, rover.getX());
        assertEquals(expectedY, rover.getY());
    }
}
