public interface Lockable {
    public void setKey(int oldKey, int newKey);
    public void lock(int enterKey);
    public void unlock(int enterKey);
    public boolean locked();
}
