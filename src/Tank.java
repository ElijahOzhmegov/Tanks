public class Tank {
    private Position pos;

    private int health;
    private int hitbox;

    private Direction direction;
    private int speed;

    public Tank(Direction direction, Position pos){
        this.pos = pos;

        this.health    = 100;
        this.direction = direction;
    }
    public Position getPosition(){
        return this.pos;
    }
    public Direction getDirection(){
        return this.direction;
    }

    public static void main(String[] args){
        System.out.println("Soon there will be a tank model!");
    }
    public enum Direction{
        UP,
        LEFT,
        DOWN,
        RIGHT
    }
    public static class Position{
        private int x;
        private int y;

        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object o){
            // If the object is compared with itself then return true
            if (o == this) {
                return true;
            }

            /* Check if o is an instance of Complex or not
              "null instanceof [type]" also returns false */
            if (!(o instanceof Position)) {
                return false;
            }

            // typecast o to Complex so that we can compare data members
            Position c = (Position) o;

            // Compare the data members and return accordingly
            return (x == c.x) && (y == c.y);
        }
    }
}
