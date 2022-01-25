package stg.product.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {

@Autowired
ProductService productService;

@Autowired
OrderService orderService;


    private List<Product> cartList = new ArrayList<>();

    public void add ( Product product)
    {

        this.cartList.add(product);


    }

    public void prtAll()
    {
        for (Product product : cartList)
        {
            System.out.println(product.getId() + " - " + product.getTitle() + "\n");
        }
    }

    public void fromOrder ()
    {
        orderService.order(cartList);
    }

    public List<Product> getCartList() {
        return cartList;
    }

    public void setCartList(List<Product> cartList) {
        this.cartList = cartList;
    }



}
