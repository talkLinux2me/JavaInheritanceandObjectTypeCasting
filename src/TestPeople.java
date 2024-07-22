public class TestPeople {
public static void main (String[] args) {
    Person aPerson;
    Boy jimmy;
    Girl betty;
    aPerson = new Person("Fred");
    jimmy = new Boy();
    betty = new Girl("Betty");

    // Boy b = new Person(): //Throw error
    // Girl g = new Person() // Throw error
    System.out.println(aPerson);
    System.out.println(aPerson.talk());
    System.out.println(aPerson.walk());
    System.out.println();

    System.out.println(jimmy);
    System.out.println(jimmy.talk());
    System.out.println(jimmy.walk());
    System.out.println();

    System.out.println(betty);
    System.out.println(betty.talk());
    System.out.println(betty.walk());
    System.out.println();

    System.out.println(Person.lifeSpan());
    System.out.println(Person.lifeSpan());
    System.out.println(Girl.lifeSpan());

    System.out.println(((Boy)aPerson).talk());


}
}
