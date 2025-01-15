package info.dmerej;

public class Rover {
    public Position position;

    public Rover(int x, int y, String direction) {
        position = new Position(x, y, direction);
    }

    public void moveForward(String orientation) {
        switch(orientation) {
            case "north":
                position.y++;
                break;
            case "south":
                position.y--;
                break;
            case "east":
                position.x++;
                break;
            case "west":
                position.x--;
                break;
        }
    }

    public void moveBackward(String orientation) {
        switch(orientation) {
            case "north":
                position.y--;
                break;
            case "south":
                position.y++;
                break;
            case "east":
                position.x--;
                break;
            case "west":
                position.x++;
                break;
        }
    }

    public void turnLeft() {
        switch(position.direction) {
            case "north":
                position.direction = "west";
                break;
            case "south":
                position.direction = "east";
                break;
            case "east":
                position.direction = "north";
                break;
            case "west":
                position.direction = "south";
                break;
        }
    }

    public void turnRight() {
        switch(position.direction) {
            case "north":
                position.direction = "east";
                break;
            case "south":
                position.direction = "west";
                break;
            case "east":
                position.direction = "south";
                break;
            case "west":
                position.direction = "north";
                break;
        }
    }

    public int getX() {
        return position.x;
    }

    public int getY() {
        return position.y;
    }

    public String getDirection() {
        return position.direction;
    }
}