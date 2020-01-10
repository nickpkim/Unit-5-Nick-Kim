public class TaskClient {
    public static void main(String[] args) {
        Task bed = new Task("Make the bed");
        Task dishes = new Task("Wash the dishes");
        Task laundry = new Task("Do the laundry");
        Task game = new Task("Play video games");

        laundry.setPriority(1);
        dishes.setPriority(2);
        bed.setPriority(3);
        game.setPriority(4);

        System.out.println(bed.toString());
        System.out.println(dishes.toString());
        System.out.println(laundry.toString());
        System.out.println(game.toString());

        laundry.doTask();
        dishes.doTask();
        bed.doTask();
        game.doTask();

        System.out.println(bed.toString());
        System.out.println(dishes.toString());
        System.out.println(laundry.toString());
        System.out.println(game.toString());
    }
}
