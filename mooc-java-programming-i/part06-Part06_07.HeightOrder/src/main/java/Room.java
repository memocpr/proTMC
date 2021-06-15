import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personList;

    public Room(){
        this.personList=new ArrayList<>();
    }

    public void add(Person person){
        personList.add(person);
    }

    public boolean isEmpty(){
        if(personList.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return personList;
    }

    public Person shortest(){

        if (!isEmpty()){
            Person shortestOne=personList.get(0);

            for (Person onePerson:personList){
                if(onePerson.getHeight()<=shortestOne.getHeight()){
                    shortestOne=onePerson;
                }
            }

            return shortestOne;
        }

        return null;

    }

    public Person take(){

        Person taken=shortest();
        personList.remove(taken);
        return taken;
    }

}
