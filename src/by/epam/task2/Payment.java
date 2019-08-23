package by.epam.task2;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/

import java.util.Arrays;

public class Payment {

    private Product[] products;

    {
        products = new Product[3];
    }

    public Payment() {

    }

    public void addProduct(Product product) {
        if (product != null) {
            for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                    products[i] = product;
                    break;
                }
            }
        }
    }

    public void sumProduct(){

        int sum = 0;

        for (int i = 0; i < products.length; i++){
            sum += products[i].cost * products[i].quantity;
        }
        System.out.println(" Your amount = " + sum);
    }

    public Product getProductByName(String name) {
        Product product = null;
        if (name != null) {
            for (int i = 0; i < products.length; i++) {
                if (products[i].getProductName().equals(name)) {
                    product = products[i];
                    break;
                }
            }
        }
        return product;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "products=" + Arrays.toString(products) +
                '}';
    }



    ////////////////////
    private class Product{


        private String name;
        private int cost;
        private int quantity;

        public Product(String name, int cost, int quantity) {
            this.name = name;
            this.cost = cost;
            this.quantity = quantity;
        }


        public String getProductName() {
            return name;
        }

        public double getProsuctCost() {
            return cost;
        }

        public int getQuantity() {
            return quantity;
        }

        public Product[] products(){
            return products;
        }

        @Override
        public String toString() {
            return "\n Product{" +
                    "name = '" + name + '\'' +
                    ", cost = " + cost +
                    ", X" + quantity +
                    '}';
        }
    }

    public void payment(){

        Payment payment = new Payment();

        System.out.println("\t\t\t\tHello \n ");

        payment.addProduct(new Payment.Product("Beer", 12, 1));
        payment.addProduct(new Payment.Product("Coffe", 15,2));
        payment.addProduct(new Payment.Product("egg", 2, 5));



        System.out.println(payment.toString());
        payment.sumProduct();

    }

}
