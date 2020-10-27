package beautysaloon;
/**
 *
 * @author Abdurrahman
 */
public class BeautySaloon {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     Customer c =new Customer(true,"Premium");
     Visit v =new Visit(c);
     
     v.setProductExpense(165.6);
     v.setServiceExpense(237.8);
     
     System.out.print("Total bill ="+v.getTotalExpense());
        
     
  

    }
    
}
