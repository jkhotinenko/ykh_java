package lesson1.demo1;

public class Start {

    public static void main(String[] args){
         System.out.println("Test");

        String[] Authors = {"John Doe"};
        Book book1 = new Book();

        book1.title="Gun";
       book1.pages=33;
       book1.Authors=Authors;
       book1.genre="Horror";
        System.out.println(book1.toString());

        //********************************************//

        Car car = new Car("VW ID5","200KW",0,false);
        System.out.println(car);

        Dog dog= new Dog("Busya",10,"Yoric");
        System.out.println(dog);
    }

}
