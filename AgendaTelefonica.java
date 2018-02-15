import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (David Rodriguez) 
 * @version (15/02/2018)
 */
public class AgendaTelefonica
{
    HashMap <String,String> agenda;
    
    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();
    }

    public void enterNumber (String name, String number)
    {
        agenda.put(name,number);
    }
    
    public void lookupNumber(String name)
    {
        System.out.println(agenda.get(name));
    }
}
