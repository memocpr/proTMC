import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> personList;

    public Employees(){
        this.personList =new ArrayList<>();
    }

    public void add(Person personToAdd){
        this.personList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream()
                .forEach(person -> this.personList.add(person));
    }

    public void print(){
        /*this.personList.stream()
                .forEach(person -> System.out.println(person));*/
        Iterator<Person> iterator = personList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void print(Education education){
        List<Person> selectedPeople=new ArrayList<>();

        personList.stream()
                .filter(person -> person.getEducation().equals(education))
                .forEach(person -> selectedPeople.add(person));

        Iterator<Person> iterator = selectedPeople.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public void fire(Education education){

        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }

}
