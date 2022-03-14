/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Admin
 */
public class Bus {

   
    private  String id;
    private  String coachName;
    private  String engin;
    private  String regId;
    private  boolean ac;
    private  String departure;
    private  String arrival;
    private  double nominalprice;
    private String date;
    
    public Bus ( String date,String id,String coachName,String engin,String regId,boolean ac,String departure, String arrival,double nominalprice ){
    
            this.date =date;
            this.id =id;
            this.coachName=coachName;
            this.engin     =   engin;
            this.regId=regId;
            this.ac=ac;
            this.departure=departure;
            this.arrival=arrival;
            this.nominalprice=nominalprice;
            
                    
    }
    public void setDate(String date){
    this.date=date;
    }
    public void setId(String id){
    this.id=id;
    }
    public void setCoachName(String coachName){
    this.coachName=coachName;
    }
    public void setEngin(String engin){
    this.engin=engin;
    }
    public void setRegId(String regId){
    this.regId=regId;
    }
    public void setAC(boolean ac){
    this.ac=ac;
    }
    public void setDeparture(String departure){
    this.departure=departure;
    }
    public void setArrival(String arrival){
    this.arrival=arrival;
    }
     public void setPrice(double nominalprice){
    this.nominalprice=nominalprice;
    }
    
    public String getDate() {
    return this.date;
  }
    public String getBusId() {
    return this.id;
  }
    
    public String getCoachName() {
    return this.coachName;
  }
    public String getEngin() {
    return this.engin;
  }
    public String getRegId() {
    return this.regId;
  }
    public boolean getAc() {
    return this.ac;
  }
    public String getDepart() {
    return this.departure;
  }
    public String getArrival() {
    return this.arrival;
  }
    public Double getPrice() {
    return this.nominalprice;
  }
}
