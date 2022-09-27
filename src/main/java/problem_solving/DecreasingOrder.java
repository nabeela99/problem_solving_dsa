package problem_solving;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class DecreasingOrder {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person ("Nabeela" , 27, 2);
        Person p2 = new Person ("Nab" , 24, 1);
        Person p3 = new Person ("Sam" , 30, 4);
        Person p4 = new Person ("Nabeela" , 24, 3);
        Person p5 = new Person ("Shams" , 29, 5);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.name.compareTo(o2.name)==0) {
                    if (o1.age > o2.age)
                            return 1;
                    else if (o1.age == o2.age){
                        return o1.id > o2.id ? 1:-1;
                    }
                }else
                    return o1.name.compareTo(o2.name);
                return 0;
            }
        });

        System.out.println(p1.equals(p4));


//        for(Person p: personList) {
//            System.out.println(p.name + " " + p.age  + " " + p.id);
//        }
    }

//Bean class
static class Person{
        @Override
        public boolean equals(Object o) {
            Person p = (Person) o;
            return this.name.equals(p.name) && this.age == p.age;
        }

        String name;
        int age;
        int id;
        public Person (String name, int age , int id){
            this.name = name;
            this.age = age;
            this.id = id;
        }
    }
}
