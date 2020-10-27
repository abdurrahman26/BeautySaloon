/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautysaloon;

/**
 *
 * @author Abdurrahman
 */
public class Visit {
    Customer name;
    double serviceExpense;
    double productExpense;

    public Visit(Customer name) {
        this.name=name;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    
    
    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }
    
   public double getTotalExpense() {
        return  (serviceExpense)*(1- Discount.getServiceDiscountrate(name.getMemberType()))+
                (productExpense)*(1- Discount.getProductDiscountrate(name.getMemberType()));
    } 
}
