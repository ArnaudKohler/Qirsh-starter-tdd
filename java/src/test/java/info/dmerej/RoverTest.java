package info.dmerej;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
 

public class RoverTest {
    
    @Test
    void movingForwardFacingNorthTest() {
        // Given a rover at position (0, 0) facing North
        Rover rover = new Rover(0, 0, "north");

        // When the rover moves forward
        rover.moveForward(rover.position.direction);

        // Then the rover should be at position (0, 1) facing North
        assertEquals(1, rover.getY());

    }
    @Test
    void movingForwardFacingSouthTest() {
        // Given a rover at position (0, 0) facing North
        Rover rover = new Rover(0, 0, "south");

        // When the rover moves forward
        rover.moveForward(rover.position.direction);

        // Then the rover should be at position (0, 1) facing North
        assertEquals(-1, rover.getY());

    }
    @Test
    void movingForwardFacingEastTest() {
        // Given a rover at position (0, 0) facing North
        Rover rover = new Rover(0, 0, "east");

        // When the rover moves forward
        rover.moveForward(rover.position.direction);

        // Then the rover should be at position (0, 1) facing North
        assertEquals(1, rover.getX());
    }
    @Test
    void movingForwardFacingWestTest() {
        // Given a rover at position (0, 0) facing North
        Rover rover = new Rover(0, 0, "west");

        // When the rover moves forward
        rover.moveForward(rover.position.direction);

        // Then the rover should be at position (0, 1) facing North
        assertEquals(-1, rover.getX());

    }
}
