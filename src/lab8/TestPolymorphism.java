package lab8;

public class TestPolymorphism {
    public static void main(String[] args) {
        PersonEx personEx1,personEx2,personEx3;
        personEx1 = new PersonEx("Mark", 1980);
        personEx2 = new Sheriff("Mateo", 1981, "California");
        personEx3 = new Police("Danny", 1986, "NYC");

        personEx1.introduce();
        personEx2.introduce();
        personEx3.introduce();


    }




}
