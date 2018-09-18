/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productclassdemo;
//Step 2: Test program
public class TestProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product1 = new Product(1,"product1");
        Product product2 = new Product(2,"product2");
        Product product3 = new Product(3,"product3");
        Product product4 = new Product(4,"product4");
        Product product5 = new Product(5,"product5");
        product1.receipt(100, 10);
        product2.receipt(200, 20);
        product3.receipt(228, 272);
        product4.receipt(2885, 11);
        product5.receipt(5, 9999);
        product1.ship(100);
        product1.setName("UBM");
        product2.setName("KTC");
        product3.setName("PPS");
        product4.setName("NSI");
        product5.setName("IWG");
        int units1 = product1.getUnits();
        product2.receipt(297, 15);
        double cost2=product2.getCost();
        product2.ship(122);
        int units2 = product2.getUnits();
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
        System.out.println(product4.toString());
        System.out.println(product5.toString());
    }
    
}
