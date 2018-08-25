import java.util.ArrayList;
public abstract class Piece{
    //private String type;
    //private String color;

    public abstract String getType();
    public abstract void setType(String type);
    public abstract String getColor();
    public abstract void setColor(String color);


    public abstract ArrayList<Integer> showMove(int r, int c);

}
