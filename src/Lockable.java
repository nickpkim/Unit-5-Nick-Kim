public interface Lockable {
    public void setKey(int newKey);
    public void lock(int enterKey);
    public void unlock(int enterKey);
    public boolean locked();
}
