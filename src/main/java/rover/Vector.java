package rover;
import java.util.HashMap;

public class Vector {

    private final int x;
    private final int y;
    private final char direction;

    public Vector(int x, int y, char direction){

        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public char direction() {
        return direction;
    }

    private static HashMap<Character,Character> leftMap
            =new HashMap<Character, Character>(){{
        put('N','W');
        put('W','S');
        put('S','E');
        put('E','N');
    }};

    private static HashMap<Character,Character> rightMap
            =new HashMap<Character, Character>(){{
        put('N','E');
        put('E','S');
        put('S','W');
        put('W','N');
    }};


    public Vector turnLeft() {
        return new Vector(this.x,this.y,leftMap.get(this.direction));
    }

    public Vector turnRight() {
        return new Vector(this.x,this.y,rightMap.get(this.direction));
    }

    public Vector next() {
        int x=this.x();
        int y=this.y();
        if(this.direction=='N')
        {
            y++;
        }
        else if(this.direction=='S')
        {
            y--;
        }
        else if(this.direction=='E')
        {
            x++;
        }
        else if(this.direction=='W')
        {
            x--;
        }
        return new Vector(x,y,this.direction);
    }
}
