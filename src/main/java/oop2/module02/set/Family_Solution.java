package oop2.module02.set;

import java.util.HashSet;
import java.util.Set;

import oop2.module02.Person;

/**
 * @author Dieter Holz
 */
public class Family_Solution {

    private final Set<Person> members = new HashSet<>();

    public int size() {
        return members.size();
    }

    public void add(Person person) {
        members.add(person);
    }

    public Person getOldest() {
        Person oldest = null;
        for (Person p : members) {
            if (oldest == null || p.getAge() > oldest.getAge()) {
                oldest = p;
            }
        }
        return oldest;
    }

    public boolean isMember(Person person) {
        return members.contains(person);
    }

}
