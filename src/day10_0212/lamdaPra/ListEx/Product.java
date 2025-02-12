package day10_0212.lamdaPra.ListEx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor

public class Product implements Comparable<Product>{
    private String product_name;
    private int price;

    public Product(String product_name, int price) {
        this.product_name = product_name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + product_name + "', price=" + price + "}";
    }

    @Override
    public int compareTo(Product o) {
        //return 값이 양수이면, 자리교환 ,0 이거나 음수이면 자리교환 X
        //return this.product_name.compareTo(o.product_name);
        //return this.product_name.charAt(0) < o.product_name.charAt(0) ? 1 : -1;

        if(this.product_name.charAt(0) > o.product_name.charAt(0)){
            return 1;

        }
        else if(this.product_name.charAt(0) == o.product_name.charAt(0)){
            if(this.price > o.price){
                return 1;
            }
            else{return -1;}
        }
        else{
            return -1;
        }

    }
}
