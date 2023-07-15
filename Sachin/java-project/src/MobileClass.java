public class MobileClass {

    private String color;
    private Integer ram;
    private Integer screenSize;
    private Motherboard motherboard;

    //A special type of method whose name is same as Class name and has not return type.  & is used for initializing variable
    //One empty const is mandatory
    MobileClass(){  

    }


  
    public MobileClass(String color, Integer ram, Integer screenSize, Double cpuSpeed, Integer transistor) {
        this.color = color;
        this.ram = ram;
        this.screenSize = screenSize;
        this.motherboard = new Motherboard(cpuSpeed, transistor);
    }



    public String getColor() {
        return color;
    }




    public void setColor(String color) {
        this.color = color;
    }




    public Integer getRam() {
        return ram;
    }




    public void setRam(Integer ram) {
        this.ram = ram;
    }




    public Integer getScreenSize() {
        return screenSize;
    }




    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }




    public void callingFunction(){
        System.out.println("Calling to a friend");
    }

    public void displayMovieFunction(){
        System.out.println("Displaying a movie");
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }



    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
    
}





