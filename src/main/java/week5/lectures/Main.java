package week5.lectures;

import week5.lectures.person.Person;
import week5.lectures.person.WeightWatchersAssociation;

public class Main {
    public static void main(String[] args) {
        Person matti = new Person("Matti");
        matti.setWeight(86);
        matti.setHeight(180);

        Person juhana = new Person("Juhana");
        juhana.setWeight(64);
        juhana.setHeight(172);

        Person heikki = new Person("Heikki", 33);
        Person pekka = new Person("Pekka", 15);

        WeightWatchersAssociation minimumWeight = new WeightWatchersAssociation(25);

        if ( minimumWeight.isAcceptedAsMember(matti) ) {
            System.out.println( matti.getName() + " is accepted as a member");
        } else {
            System.out.println( matti.getName() + " is not accepted as a member");
        }

        if ( minimumWeight.isAcceptedAsMember(juhana) ) {
            System.out.println( juhana.getName() + " is accepted as a memberksi");
        } else {
            System.out.println( juhana.getName() + " is not accepted as a member");
        }

        System.out.println();

        if(pekka.olderThan(heikki)) {
            System.out.println(pekka.getName() + " is older than " + heikki.getName());
        } else {
            System.out.println(pekka.getName() + " is not older than " + heikki.getName());
        }

    }
}
