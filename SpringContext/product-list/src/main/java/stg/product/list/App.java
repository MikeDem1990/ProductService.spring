package stg.product.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean("productService", ProductService.class);

        productService.addToCart("banana");
        productService.addToCart("potato");
        productService.addToCart("apple");
        productService.addToCart("orange");
        productService.addToCart("egg");

        productService.cart.fromOrder();




    }
}
