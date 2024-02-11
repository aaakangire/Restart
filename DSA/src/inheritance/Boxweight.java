package inheritance;

import java.util.BitSet;

public class Boxweight extends Box{
    int weight;

    Boxweight(){
        this.weight = -1;
    }

    Boxweight(int weight){
        this.weight = weight;
    }

    Boxweight(int l, int b, int h, int weight){
        super(l, b, h);
        this.weight = weight;
    }

    Boxweight(Boxweight old){
        super(old);
        this.weight = old.weight;
    }

//    example of runtime polymorphism
    @Override
    void greeting(){
        System.out.println("Hello Boxweight");
    }
}
