/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author Admin
 */
public abstract class User {
   private String id;
   private String name;
   private String cell;
   private String email;
   private String password;
   private String address;
   private Date created;

   public User(String id,String name,String cell,String email, String address, Date created) {
      
      this.id = id;
      this.name = name;
      this.cell = cell;
      this.email = email;
      this.password = password;  
      this.address = address; 
      this.created = created;
   }
        public String getid() {
      return id;
   }

        public String getName() {
      return name;
   }
        public String getcell() {
      return cell;
   }
             public String getemail() {
      return email;
   }
              public String getAddress() {
      return address;
   }
                     public Date getcreated() {
      return created;
   }
 
}
   
   
    

