public class Num implements Comparable{
    private int num;

    public Num(){
        this.num = 0;
    }

    public Num(int num){
        this.num = num;
    }

    public int compareTo(Object other){
        Num otherNum = (Num) other;
        return this.getNum() - otherNum.getNum();
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public boolean isEqual(Num otherNum){
        return this.num == otherNum.getNum();
    }

    public String toString(){
        String str = num + "";
        return str;
    }
}
