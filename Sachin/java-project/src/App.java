public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        
        //Construnction initialization

        MobileClass samsungMobile = new MobileClass("Red",6,10,2.2,50);


        //From getters and setters

        System.out.println(samsungMobile.getColor());
        System.out.println(samsungMobile.getRam());
        System.out.println(samsungMobile.getScreenSize());
    
        System.out.println("CpuSpeed :"+ samsungMobile.getMotherboard().getCpuSpeed());
        System.out.println("Transistors :"+ samsungMobile.getMotherboard().getTransistors());

        samsungMobile.callingFunction();

    }
}
