package mic.maev.recyclerviewpractic;

public class Student {
    private String group;
    private String firstname;
    private String lastname;

    public Student (String group, String firstname, String lastname){
        this.group = group;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getGroup(){
        return this.group;
    }

    public void setGroup(String group){
        this.group = group;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }
}
