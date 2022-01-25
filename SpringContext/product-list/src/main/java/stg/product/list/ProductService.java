package stg.product.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ProductService {

@Autowired
Cart cart;


    private List<Product> productList = new ArrayList<>();

    public ProductService() {

        this.productList.add(new Product(1,"apple",160));
        this.productList.add(new Product(2,"meat",350));
        this.productList.add(new Product(3, "onion",100));
        this.productList.add(new Product(4,"egg",120));
        this.productList.add(new Product(5,"orange", 130));
        this.productList.add(new Product(6,"cookie",230));
        this.productList.add(new Product(7, "banana", 250));
        this.productList.add(new Product(8, "potato", 90));
        this.productList.add(new Product(9,"lemon",190));
        this.productList.add(new Product(10,"pepper", 300));

    }


    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addToCart ( String argProduct )
    {
        for (Product product : productList)
        {
            if (product.getTitle().equals(argProduct)
            ) {
                cart.add(product);
                System.out.println("Продукт " + argProduct + " был добаылен в корзину! \n");
            }

        }

    }

    public void findByTitle (String arg)
    {

        for (Product product : productList)
        {
            if (product.getTitle().equals(arg))
            {
               System.out.println("Продукт " + arg + "был найден ! \n");
            }

        }

    }



    public void printAll ()
    {

        for (Product prodCount : productList)
        {
            System.out.println(prodCount.getId()+" - " + prodCount.getTitle() +"\n");
        }
    }


}
