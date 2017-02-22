package me.uncledrew.chapter1.storage;

import me.uncledrew.chapter1.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by wangjian on 2017/2/22.
 */
public class CustomerStorage {
    public List<Customer> getCustomerList(String keyword){
        return null;
    }

    public Customer getCustomer(long id){
        return null;
    }

    public boolean createCustomer(Map<String,Object> fieldMap){
        return false;
    }
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return false;
    }
    public boolean deleteCustomer(long id){
        return false;
    }
}
