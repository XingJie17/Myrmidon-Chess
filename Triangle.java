import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends Piece {
    private String type;
    private String color;
    public Triangle(String color){
        this.setType("Triangle");
        this.setColor(color);
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public ArrayList<Integer> showMove(int r, int c){

        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int step = 1; step<=2; step++){
            int r1 = r + step;
            int c1 = c + step;
            int r2 = r - step;
            int c2 = c - step;
            if((r1>=0 && r1<=5) && (c1>=0 & c1<=6)){
                a.add(r1);
                a.add(c1);
            }
            if((r1>=0 && r1<=5) && (c2>=0 && c2<=6)){
                a.add(r1);
                a.add(c2);
            }
            if((r2>=0 && r2<=5) && (c1>=0 && c1<=6)){
                a.add(r2);
                a.add(c1);
            }
            if((r2>=0 && r2<=5) && (c2>=0 && c2<=6)){
                a.add(r2);
                a.add(c2);
            }
        }
        return a;
    }
}
