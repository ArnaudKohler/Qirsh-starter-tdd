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
        Rover rover = new Rover(0, 0, 'N');
        rover.moveForward();
        assertEquals(1, rover.getY());

    }
}
