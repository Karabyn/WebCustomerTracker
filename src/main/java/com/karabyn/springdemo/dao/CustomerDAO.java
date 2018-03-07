package com.karabyn.springdemo.dao;

import com.karabyn.springdemo.entity.Customer;

import java.util.List;

/**
 * Created by Petro Karabyn
 * on 04-Mar-18
 */
public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);
}
