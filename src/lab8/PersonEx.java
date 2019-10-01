package lab8;

public class PersonEx {
    String name;
    int bornYear;

    public PersonEx (String name,int bornYear){
        this.name = name;
        this.bornYear = bornYear;

    }

    public void introduce (){
        System.out.print("My name is"+name+",");
        System.out.println("I was born in"+bornYear+".");
    }
}
