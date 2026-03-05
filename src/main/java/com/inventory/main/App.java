package com.inventory.main;

import com.inventory.dao.ProductDAO;
import com.inventory.entity.Product;

public class App {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();

        // INSERT
        Product p1 = new Product("Laptop", 75000.0, 10, "Gaming Laptop");
        Product p2 = new Product("Mouse", 1200.0, 50, "Wireless Mouse");

        dao.saveProduct(p1);
        dao.saveProduct(p2);

        // READ
        Product fetched = dao.getProduct(1L); // use Long type for ID
        if (fetched != null) {
            System.out.println("Product Found: " + fetched.getName());
        }

        // UPDATE
        dao.updateProduct(1L, 72000.0, 8);

        // DELETE
        dao.deleteProduct(2L);

        System.out.println("Operations Completed Successfully");
    }
}