/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productclassdemo;
//Step 1: create a product class
public class Product {

    private int number;
    private String name;
    private int units;
    private double cost;

    public Product() {
    }

    public Product(int number, String name) {
        this.number = number;
        this.name = name;
        units=0;
        cost=0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (units != 0) {
            return;
        } else {
            this.number = number;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnits() {
        return units;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (units != 0) {
            return;
        } else {
            this.cost = cost;
        }
    }

    public void receipt(int receivingNumber, double costPerProduct) {
        double currentCost = units * cost;
        double receivingCost = receivingNumber * costPerProduct;
        double totalCost = currentCost + receivingCost;
        this.units += receivingNumber;
        cost=totalCost/this.units;
    }

    public void ship(int shipNumber) {
        if (shipNumber > units) {
            return;
        } else {
            units -= shipNumber;
        }
    }

    @Override
    public String toString() {
        String retValue = "";
        String costAsString = String.format("%.2f", cost);
        String totalCostAsString = String.format("%.2f", cost * units);
        retValue += "Product Name: " + name + " Number=" + number + " Inventory units=" + units + " Cost=" + costAsString + ", Total cost=" + totalCostAsString;
        return retValue;
    }

}
