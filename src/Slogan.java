public class Slogan implements Lockable{
    private static int count = 0;
    private String slogan;
    private int key;
    private boolean isLocked;

    public void setKey(int newKey){
        key = newKey;
    }
    public void lock(int enterKey){
        if (this.key == enterKey) {
            isLocked = true;
        } else {
            System.out.println("Doesn't fit.");
        }
    }
    public void unlock(int enterKey){
        if (this.key == enterKey) {
            isLocked = false;
        } else {
            System.out.println("Doesn't fit.");
        }
    }
    public boolean locked(){
        return isLocked;
    }

    public Slogan(String slogan){
        if (isLocked){
            System.out.println("Method is locked.");
        } else {
            this.slogan = slogan;
            count++;
        }
    }
    public static int getCount(){
        return count;
    }
    public String toString(){
        if (isLocked){
            System.out.println("Method is locked.");
        } else {
            return slogan;
        }
    }
}
