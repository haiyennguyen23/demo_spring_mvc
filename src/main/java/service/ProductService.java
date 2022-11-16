package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static List<Product> products = new ArrayList<>();


    static {
        products.add(new Product(1,"Bút chì","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUQZJTaMvbvE-sJrz-kvYIUs9xud4MSLCl4HTaoPrm&s", 5000.0));
        products.add(new Product(2,"Bút mực","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUQZJTaMvbvE-sJrz-kvYIUs9xud4MSLCl4HTaoPrm&s", 200.0));
        products.add(new Product(3,"Vở kẻ ngang","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUQZJTaMvbvE-sJrz-kvYIUs9xud4MSLCl4HTaoPrm&s", 1000.0));
        products.add(new Product(4,"Vở ô ly","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUQZJTaMvbvE-sJrz-kvYIUs9xud4MSLCl4HTaoPrm&s", 7000.0));
    }
    public static void add(Product product){
        products.add(product);
    }
    public  static void delete(int id){
        products.remove(findByid(id));
    }
    public static Product findByid(int id){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==id){
                return products.get(i) ;
            }
        }
        return null;
    }
    public static void edit(int id,Product product){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()== id){
                products.set(i,product);
            }
        }
    }
}
