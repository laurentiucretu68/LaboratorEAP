package com.example.lab4.repository;

import com.example.lab4.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    @Value("${db.url}")
    private String url;
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;

    // Adaugarea unui produs in baza de date
    public void addProduct(Product product){
        String sql = "insert into product values(NULL, ?, ?);";
        try(Connection conn = DriverManager.getConnection(url, username, password)){

            var statement = conn.prepareStatement(sql);
            statement.setString(1, product.getName());
            statement.setBigDecimal(2, product.getPrice());
            statement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Product> getProducts(){
        String sql = "select *from product";
        List<Product> list = new ArrayList<Product>();

        try(Connection conn = DriverManager.getConnection(url, username, password)){
            var statement = conn.prepareStatement(sql);
            ResultSet res = statement.executeQuery();

            while (res.next()){
                Product prod = new Product();
                prod.setId(res.getInt("id"));
                prod.setName(res.getString("nume"));
                prod.setPrice(res.getBigDecimal("price"));

                list.add(prod);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}
