public class SloganClient {
    public static void main(String args[]){
        Slogan ace = new Slogan("ace is the place");
        Slogan empire = new Slogan("eight-hundred, five eight eight");
        Slogan obama = new Slogan("hope");
        Slogan mac = new Slogan("loving it");

        System.out.println(ace.toString());
        System.out.println(empire.toString());
        System.out.println(obama.toString());
        System.out.println(mac.toString());

        System.out.println(Slogan.getCount());
    }
}
