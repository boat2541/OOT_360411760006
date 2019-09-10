package lab7;

public class Pet {
    //class Attributes
    private String ownername;
    private String petname;
    private int petAge;

    //constructor
    public Pet(){}

    public Pet(String ownername,String petname,int petAge){
        this.ownername = ownername;
        this.petname = petname;
        this.petAge = petAge;
    }



    //getter and setter methods
    public String getOwnername(){
        return this.ownername;

    }

    public void setOwnername(String newOwenername){
        this.ownername = newOwenername;
    }

    public String getPetname(){
        return this.petname;
    }

    public void setPetname(String newpetname){
        this.petname = newpetname;
    }

    public int getPetAge(){
        return this.petAge;
    }

    public void setPetAge(int petAge){
        this.petAge = petAge;
    }










}//class
