public class Slogan implements Lockable{
    private static int count = 0;
    private String slogan;
    private int key;
    private boolean isLocked;

    public void setKey(int oldKey, int newKey){
        if (oldKey == key){
            key = newKey;
        }
    }
    public void lock(int enterKey){
        if (this.key == enterKey) {
            isLocked = true;
            System.out.println("Locked.");
        } else {
            System.out.println("Doesn't fit.");
        }
    }
    public void unlock(int enterKey){
        if (this.key == enterKey) {
            isLocked = false;
            System.out.println("Unlocked.");
        } else {
            System.out.println("Doesn't fit.");
        }
    }
    public boolean locked(){
        return isLocked;
    }

    public Slogan(String slogan, int key){
        this.slogan = slogan;
        this.key = key;
        count++;
    }
    public static int getCount(){
        return count;
    }
    public String toString(){
        if (isLocked){
            return "Method is locked.";
        } else {
            return slogan;
        }
    }
}
