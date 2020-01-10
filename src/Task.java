public class Task implements Priority{
    private String task;
    private boolean isComplete;
    private int priorityRank;

    public Task(String task){
        this.task = task;
        isComplete = false;
        priorityRank = 1;
    }
    public Task(String task, int priority){
        this.task = task;
        isComplete = false;
        this.priorityRank = priority;
    }
    public int getPriority(){
        return priorityRank;
    }
    public void setPriority(int priority){
        this.priorityRank = priority;
    }
    public void doTask(){
        System.out.println("Processing... Complete!");
        isComplete = true;
        priorityRank = 0;
    }
    public String toString(){
        return "Task: "+task+"; Priority rank:"+this.getPriority();
    }
}