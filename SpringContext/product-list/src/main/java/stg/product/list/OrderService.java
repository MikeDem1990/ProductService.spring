package stg.product.list;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {



    public void order (List<Product> arg)
    {

        int result = 0;

        for (Product product : arg)
        {


            result += product.getCost();
        }
        
        System.out.println("Итоговая стоимость состовляет : " + result + "  рублей");

    }


}
