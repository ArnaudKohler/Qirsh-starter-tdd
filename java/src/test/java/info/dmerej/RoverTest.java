package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    class Position {
        public int x;
        public int y;
        public char direction;

        public Position(int x, int y, char direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

    }

    class Rover {
        public Position position;

        public Rover(int x, int y, char direction) {
            position = new Position(x, y, direction);
        }

        public void moveForward() {
            position.y++;
        }

        public int getX() {
            return position.x;
        }

        public int getY() {
            return position.y;
        }
    }

    @Test
    void movingForwardTest() {
        // Given a rover at position (0, 0) facing North
        Rover rover = new Rover(0, 0, 'N');

        // When the rover moves forward
        rover.moveForward();

        // Then the rover should be at position (0, 1) facing North
        assertEquals(1, rover.getY());

    }
}
