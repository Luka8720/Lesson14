public class Patient {
   private String name;
   private String condition;
   
   public Patient(String n, String c){
       name = n;
       condition = c;
   }
   
   public String toString(){
       return "\n"+name+"\t"+condition;
   }
   
}
