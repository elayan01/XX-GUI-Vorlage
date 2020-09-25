package model;

public class Employee {
    private String sex;
    private int age;
    private int birthyear;
    private int workyears;
    private String name;
    private String lastname;
    private String einschränkungen;

    public Employee(String sex,int birthyear,int thisYear,int workStart) {
        this.sex=sex;
        age=thisYear-birthyear;
        this.birthyear=birthyear;
        workyears=thisYear-workStart;
        name="";
        lastname="";
        einschränkungen="";
    }
    public String getSex() {
        return sex;
    }

    public void setSex() {
        if (sex.equals("m")){
            sex="w";
        }
        else if (sex.equals("w")){
            sex="d";
        }
        else if (sex.equals("d")){
            sex="m";
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(){
        age=age+1;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public int getWorkyears() {
        return workyears;
    }

    public void setWorkyears() {
        workyears=workyears+1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEinschränkungen() {
        return einschränkungen;
    }

    public void setEinschränkungen(String einschränkungen) {
        this.einschränkungen = einschränkungen;
    }
}
