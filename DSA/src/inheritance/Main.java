package inheritance;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(3, 5, 8);
        Boxweight boxweight = new Boxweight(4, 5, 6,20);

        Boxweight boxweight1 = new Boxweight(boxweight);

        Box boxweight2 = new Boxweight(20, 21, 22, 23);

//        what object refrence can access depends on type (in this case Box) but which method to call in case of ovverriding
//        depends on which object is created ( Boxweight).
        boxweight2.greeting();

        boxweight1.greeting();

        box.greeting();


//        System.out.println(boxweight2.);

//        System.out.println(boxweight1.l);

//        boxweight.l = 12;

//        System.out.println(boxweight.l + " " + boxweight1.l);
    }
}
