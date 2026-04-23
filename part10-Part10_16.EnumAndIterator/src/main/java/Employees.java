
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Employees {

    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            this.list.add(person);
        }
    }

    public void print() {
        this.list.stream().forEach(person -> System.out.println(person));
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.list.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.list.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
