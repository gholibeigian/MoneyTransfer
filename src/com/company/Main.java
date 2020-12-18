package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Here I am going to do it!");
        Person myPerson = new Person(12,"Sandra","haruiosth23234");
        Person myPerson1 = new Person(23,"Amanda","haruio34");
        Person myPerson2 = new Person(25,"Gabriella","asdfuio23");
        Person myPerson3 = new Person(32,"Fati","th23234");
        // write your code here

        Account myAccount = new Account(123,"Start");
        Account myAccount = new Account(54,"St");
        Account myAccount = new Account(87945,"Mt");
        Account myAccount = new Account(576,"Zut");

        System.out.println("Hallo Mary, I love" +
                "you!");
        System.out.println("How is the weather there");
        System.out.println("Where is the boss!");
        System.out.println("Where is the boss!");

        System.out.println("Hello Simon!");
        System.out.println("Fuck off! You do not have money!");
        System.out.println("We should welcome the boss!");
        Person boss = new Person(56,"Boss B", "Holland Street 99");
        System.out.println("Wellcome " + boss.Name);
        System.out.println("Boss, when you are a rick man," +
                "I will sleep with you!");
        Account maryAccount = new Account(35,"no money no honey!");

        System.out.println("Hi Simon!");
        System.out.println("I love you Simon!");
        System.out.println("That is why I need your help!");

        Person helper = Person(32,"Simon","Stupid land Street 1");
        System.out.println("Simon takes care of Mary!");
        System.out.println("Mary is the love of his life" +
                ", but he has to pay a lot!");
        Account simonAccoun1t = new Account(2323, "out of order!");
        Person helpe1r = new Person(32,"Simon","Stupid land Street 1");
        System.out.println("Simon takes care of Mary!");
        System.out.println("Mary is the love of his life" +
                ", but he has to pay a lot!");
        Account simonAccoun2t = new Account(2323, "out of order!");



    }
    public void errorHandling(){
        try {
            System.out.println("Error is not there anymore!");
            System.out.println("Simon is an error");
            System.out.println("help!");
        }
        catch (exception e){
            System.out.println("I cannot do it anymore!");
        }


    }
}
