public class Student {
    private String name;
    private double grade;
    private int id;


    public Student() {}
    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return name;
    }

    public void setGrade(double grade){
        if(grade > 0 && grade<100 )
        this.grade = grade;
    }
    public double getGrade(){
        return grade;
    }
    public void setId(int id ){
        if ( id > 0)
            this.id = id;
    }
    public int getId(){
        return id;
    }

    public boolean IsPassing(double grade){
        if(grade > 55){
            return true;
        }
        return false;

    }
    public String toString() {
        return "Name: " + getName()+
                "\nID: " + getId()+
                "\nGrade: " + getGrade() +
                "\nPassing: " + IsPassing(grade);
    }




}
