public class Patient {
   private String name;
   private String condition;
   
   public Patient(String n, String c){
       n = name;
       c = condition;
   }
   
   public String toString(){
       return "Name: "+name+" Condition: "+condition;
   }
   
}
