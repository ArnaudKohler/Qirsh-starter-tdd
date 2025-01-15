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

    public int getX() {
        return position.x;
    }

    public int getY() {
        return position.y;
    }
}