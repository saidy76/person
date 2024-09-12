package person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;


    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
        
    }
    public String getgender(){
        return gender;
    }
    public void setgender(String gender){
        this.gender=gender;
    }
      public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address=address;
    }
    
    
    public static void main(String[] args) {
        Person man1 = new Person();
        man1.setname("Akash");
        man1.setage(25);
        man1.setgender("male");
        man1.setaddress("dhaka");
        
        Person man2 = new Person();
 
        man2.setname("Abir");
        man2.setage(20);
        man2.setgender("male");
        man2.setaddress("khulna");
        
         Person man3 = new Person();
        man3.setname("Asha");
        man3.setage(22);
        man3.setgender("female");
        man3.setaddress("Bogura");
        
        
         System.out.println("Person 1:");
       System.out.println("Name " +man1.getname());
        System.out.println("Age : " +man1.getage());
         System.out.println("Gender : " +man1.getgender());
          System.out.println("Address: " +man1.getaddress());
          
             System.out.println("Person 2:");
       System.out.println("Name " +man2.getname());
        System.out.println("Age : " +man2.getage());
         System.out.println("Gender : " +man2.getgender());
          System.out.println("Address: " + man2.getaddress());
          
             System.out.println("Person 3:");
       System.out.println("Name " +man3.getname());
        System.out.println("Age : " +man3.getage());
         System.out.println("Gender : " +man3.getgender());
          System.out.println("Address: " +man3.getaddress());
          

    }
}
