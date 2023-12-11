public class Camera {
    private int x;
    private int y;


    /*get methods */
    public int getx(){
        return x;
    }

    public int gety(){
        return y;
    }

    /*Constructor */
    public Camera(int X, int Y ){
        this.x=X;
        this.y=Y;
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";

    }

    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}



}
