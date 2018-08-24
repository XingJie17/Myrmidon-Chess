public abstract class Piece{
    private String name;
    private String color;

    public String getName(){return name;}
    public void setName(String newName){name = newName;}
    public String getColor (){return color;}
    public void setColor(String newColor){color = newColor;}


    public void isClicked(){
        System.out.println(this.getName() + " is clicked");
    }
    public void showMove(int x, int y){
	    System.out.println("X = "+x+"\nY = "+y);
    }

}
