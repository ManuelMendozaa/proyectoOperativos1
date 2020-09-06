package Model;

public class Storage {
    
    private final int size;
    private final int food[];

    public Storage(int size) {
        this.size = size;
        this.food = new int[size];
    }

    public int getSize() {
        return size;
    }

    public void setFood(int value, int pointer) {
        this.food[pointer] = value;
    }
    
}
