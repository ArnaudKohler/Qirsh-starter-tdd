package info.dmerej;

class Rover {
    public Position position;

    public Rover(int x, int y, String direction) {
        position = new Position(x, y, direction);
    }

    public void moveForward(String orientation) {
        switch(orientation) {
            case "north":
                position.y++;
            case "south":
                position.y--;
            case "east":
                position.x++;
            case "west":
                position.x--;
        }
        position.y++;
    }

    public int getX() {
        return position.x;
    }

    public int getY() {
        return position.y;
    }
}
