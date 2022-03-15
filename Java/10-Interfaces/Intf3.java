//Use Interface instances to call the implemented method in the implemented class

interface InterfaceDemo{
    default public void displayNameDefault(String name){
       System.out.println("Your name is : " + name);
   }
    public void displayName(String name);
    public void displayNameAndDesignation(String name, String designation);
}

class InterfaceDemoImpl implements InterfaceDemo{
    public void displayName(String name) {
         System.out.println(name);
    }  
      public void displayNameAndDesignation(String name, String designation) {
           System.out.println("Name:" + name + "\n"+ "Designation:" + designation);
     }
}

class Intf3 {
    public static void main(String args[]){
        InterfaceDemo demo = new InterfaceDemoImpl();
        demo.displayName("Adithya");
        demo.displayNameAndDesignation("Adithya", "Java Developer");
        demo.displayNameDefault("Adithya");
     }
}