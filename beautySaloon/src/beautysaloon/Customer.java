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
 
//  enum nmembership {none,Premium,Gold,Silver}; 

public class Customer {
    
    boolean member;
    String memberType;  

    public Customer() {
        this.member=false;
    }
    
    public Customer(boolean m,String mType) {
          this.member=m;
          this.memberType= mType;
    }

    public String getMemberType() {
        return memberType;
    }


    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    
    public boolean isMember ()
    {
        return member;
    }

}
