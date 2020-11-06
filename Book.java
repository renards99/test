/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TNC
 */
/**
     * @param args the command line arguments
     */
    public class Book {
    private String code;
    private String title;
    private double price;
    private int quantity;

    public Book() {
        code = title = "";
        price = 0;
        quantity = 0;
    }

    public Book(String code, String title, double price, int quantity) {
        this.code = code;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        double totalmoney = quantity * price;
        return code + "\t" + title + "\t" + price + "\t" + quantity + "\t" + totalmoney;                
    }
   
}

    

