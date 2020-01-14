public class SloganClient {
    public static void main(String args[]){
        Slogan ace = new Slogan("ace is the place", 111);
        Slogan empire = new Slogan("eight-hundred, five eight eight", 2300);
        Slogan obama = new Slogan("hope", 8008);
        Slogan mac = new Slogan("loving it", 404);

        System.out.println(ace.toString());
        System.out.println(empire.toString());
        System.out.println(obama.toString());
        System.out.println(mac.toString());

        System.out.println(Slogan.getCount());

        ace.lock(111);
        empire.lock(2300);

        System.out.println(ace.toString());
        System.out.println(empire.toString());

        ace.unlock(123);
        empire.unlock(588);

        System.out.println(ace.toString());
        System.out.println(empire.toString());

        ace.unlock(111);
        empire.unlock(588);

        System.out.println(ace.toString());
        System.out.println(empire.toString());

        empire.setKey(2300, 588);
        empire.unlock(588);

        System.out.println(empire.toString());
    }
}
