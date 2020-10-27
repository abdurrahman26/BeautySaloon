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
public class Discount {
    static double serviceDiscount =0 ;
    static double productDiscount=0.1 ;
    
    
    public static double getServiceDiscountrate(String memberType)
    {
        switch (memberType)
        {
            case "Premium":
               serviceDiscount=0.2;
               break;
            case "Gold":
               serviceDiscount=0.15;
               break;
            case "Silver":
               serviceDiscount=0.1;
               break;
        }
        return serviceDiscount;
    }
    public static double getProductDiscountrate(String memberType)
    {
         return productDiscount;
    }
}
