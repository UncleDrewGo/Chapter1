package me.uncledrew.chapter1;

import com.sun.xml.internal.bind.v2.TODO;
import me.uncledrew.chapter1.model.Customer;
import me.uncledrew.chapter1.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangjian on 2017/2/22.
 */
public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init(){
        //TODO 初始化数据库
    }

    @Test
    public void getCustomerKListTest() throws Exception {

        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2,customerList.size());

    }

    @Test
    public void getCustomerTest() throws Exception {
        long id =1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNull(customer);

    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("name","customer100");
        fieldMap.put("contact","Jone");
        fieldMap.put("phone","0000000");
        boolean customer = customerService.createCustomer(fieldMap);
        Assert.assertTrue(customer);
        
    }

    @Test
    public void updateCustomerTest() throws Exception {

        long id = 1;
        Map<String,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("contact","uncledrew");
        boolean customer = customerService.updateCustomer(id,fieldMap);
        Assert.assertTrue(customer);
    }

    @Test
    public void deleteCustomer() throws Exception {
        long id =1;
        boolean b = customerService.deleteCustomer(id);
        Assert.assertTrue(b);


    }
}
