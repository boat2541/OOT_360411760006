package lab7;

public class PetApp {
    public static void main(String[] args) {

        //create class instant (object)
        Pet pet1 = new Pet();

        pet1.setOwnername("boat");
        pet1.setPetname("owen");
        pet1.setPetAge(2);

        System.out.println(pet1.getOwnername());
        System.out.println(pet1.getPetname());
        System.out.println(pet1.getPetAge());

        Pet pet2 = new Pet();

        pet2.setOwnername("mario");
        pet2.setPetname("the toy");
        pet2.setPetAge(10);

        System.out.println(pet2.getOwnername());
        System.out.println(pet2.getPetname());
        System.out.println(pet2.getPetAge());

        Pet pet3 = new Pet("boat","the toy",2);

        System.out.println(pet3.getOwnername());
        System.out.println(pet3.getPetname());
        System.out.println(pet3.getPetAge());

























    }//main







}//class
