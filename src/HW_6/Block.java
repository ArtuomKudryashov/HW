package HW_6;

public class Block {
    private  int widht;
    private  int lenght;
    private int height;

    public int getWidht() {
        return widht;
    }

    public int getLenght() {
        return lenght;
    }

    public int getHeight() {
        return height;
    }

    public Block(int[] arr, int lenght, int height,int widht){
       this.widht = arr[0];
       this.lenght = arr[1];
       this.height = arr[2];

    }

    public  int getVolume(){
        return  getWidht()*getHeight()*getLenght();
    }
    public  int getSurfaceArea(){
        return getHeight()*getLenght()*2+getWidht()*getWidht()*2+getWidht()*getLenght();
    }

}
