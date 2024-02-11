package inheritance;

public class Box {
    int l;
    int b;
    int h;

    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Box(int side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    void greeting(){
        System.out.println("Hello Box");
    }
}
