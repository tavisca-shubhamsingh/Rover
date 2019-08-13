package rover;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VectorTest {

    @Test
    void vectorInitializeWithStartingPosition()
    {
        Vector r=new Vector(0,0,'N');
        assertEquals(0,r.x());
        assertEquals(0,r.y());
        assertEquals('N',r.direction());

    }

    @Test
    void vectorCanRotateLeftFromNorth()
    {
        Vector r=new Vector(0,0,'N');
        Vector newVector=r.turnLeft();
        assertEquals('W',newVector.direction());
    }

    @Test
    void vectorCanRotateLeftFromWest()
    {
        Vector r=new Vector(0,0,'W');
        Vector newVector=r.turnLeft();
        assertEquals('S',newVector.direction());
    }

    @Test
    void vectorCanRotateLeftFromSouth()
    {
        Vector r=new Vector(0,0,'S');
        Vector newVector=r.turnLeft();
        assertEquals('E',newVector.direction());
    }

    @Test
    void vectorCanRotateLeftFromEast()
    {
        Vector r=new Vector(0,0,'E');
        Vector newVector=r.turnLeft();
        assertEquals('N',newVector.direction());
    }

    @Test
    void vectorCanRotateRightFromNorth()
    {
        Vector r=new Vector(0,0,'N');
        Vector newVector=r.turnRight();
        assertEquals('E',newVector.direction());
    }

    @Test
    void vectorCanRotateRightFromEast()
    {
        Vector r=new Vector(0,0,'E');
        Vector newVector=r.turnRight();
        assertEquals('S',newVector.direction());
    }

    @Test
    void vectorCanRotateRightFromSouth()
    {
        Vector r=new Vector(0,0,'S');
        Vector newVector=r.turnRight();
        assertEquals('W',newVector.direction());
    }

    @Test
    void vectorCanRotateRightFromWest()
    {
        Vector r=new Vector(0,0,'W');
        Vector newVector=r.turnRight();
        assertEquals('N',newVector.direction());
    }

    @Test
    void movingFromNorth()
    {
        Vector r=new Vector(0,0,'N');
        Vector newVector=r.next();
        assertEquals(1,newVector.y());
    }

    @Test
    void movingFromWest()
    {
        Vector r=new Vector(0,0,'W');
        Vector newVector=r.next();
        assertEquals(-1,newVector.x());
    }

    @Test
    void movingFromSouth()
    {
        Vector r=new Vector(0,0,'S');
        Vector newVector=r.next();
        assertEquals(-1,newVector.y());
    }

    @Test
    void movingFromEast()
    {
        Vector r=new Vector(0,0,'E');
        Vector newVector=r.next();
        assertEquals(1,newVector.x());
    }



}
