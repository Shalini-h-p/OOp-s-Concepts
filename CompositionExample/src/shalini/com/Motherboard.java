package shalini.com;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private int bios;

    public Motherboard(String model, String manufacturer, int ramSlots,int cardSlots,int bios){
        this.model=model;
        this.manufacturer=manufacturer;
        this.ramSlots=ramSlots;
        this.cardSlots=cardSlots;
        this.bios=bios;
    }

    public void loadProgramName(String programName){
        System.out.println(" program " +programName+ " is now loading...  ");
    }


    public String getModel(){
        return model;
    }
    public String getManufacture(){
        return manufacturer;
    }
    public  int getRamSlots(){
        return ramSlots;
    }
    public int getCardSlots(){
      return cardSlots;
    }
    public int bios(){
        return bios;
    }


}
