public class Num {
    private int num;

    public Num(){
        this.num = 0;
    }

    public Num(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public String toString(){
        String str = num + "";
        return str;
    }

    public boolean isEquals(Num otherNum){
        return this.num == otherNum.getNum();
    }
}
