import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterTest;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    Tank.Position start = new Tank.Position(0, 0);
    Tank tank1 = new Tank(Tank.Direction.UP, start);

    @Test
    void getPosition() {
        Tank.Position expected = new Tank.Position(0, 0);
        assertEquals(expected, tank1.getPosition());
    }
    @Test
    void getDirection(){
        assertEquals(Tank.Direction.UP, tank1.getDirection());
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}