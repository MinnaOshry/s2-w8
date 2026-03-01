// Tree.java
// Represents a single tree in the forest

public class Tree {
    public static final int EMPTY = 0;
    public static final int TREE = 1;
    public static final int BURNING = 2;
    private int state;
    private int burnTime;
    public static int burnDuration = 2;

    public Tree(int state) {
        this.state = state;
        this.burnTime = 0;
    }
    public Tree(Tree copy) {
        this.state = copy.state;
        this.burnTime = copy.burnTime;
    }
    public int getState() { return state; }
    public void setState(int state) { this.state = state; }
    public int getBurnTime() { return burnTime; }
    public void setBurnTime(int burnTime) { this.burnTime = burnTime; }
}
