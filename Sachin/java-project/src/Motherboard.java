public class Motherboard {
    private Double cpuSpeed; //gHz 2.2, 2.4 
    private Integer transistors;


    public Motherboard(Double cpuSpeed, Integer transistors) {
        this.cpuSpeed = cpuSpeed;
        this.transistors = transistors;
    }

    public Double getCpuSpeed() {
        return cpuSpeed;
    }

    public Integer getTransistors() {
        return transistors;
    }
  
    
}
