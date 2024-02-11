package inheritance;

public class Boxprice extends Box{
    int price;
    int weight;

    Boxprice(){
        this.price = -1;
        this.weight = -1;
    }

    Boxprice(int l, int b, int h, int price, int weight){
        super(l, b, h);
        this.price = price;
        this.weight = weight;
    }
}
