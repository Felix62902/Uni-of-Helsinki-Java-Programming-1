import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<Person>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if (this.isEmpty()){
            return null;
        }
        int shortesth = this.persons.get(0).getHeight();
        Person shortp = this.persons.get(0);
        for(Person p : persons){
            if(p.getHeight()< shortesth){
                shortesth = p.getHeight();
                shortp= p;
            }
        }
        return shortp;
        
    }
    
    public Person take() {
        Person shortest =shortest();
        if (this.isEmpty()){
            return null;
        }
        persons.remove(shortest());
        return shortest;
    }
}
