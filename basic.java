import java.time.LocalDate;

public class basic {
    public static void main(String [] args){
        Person p = new Person("Tarteel", "Female", "Swizerland" , 549186655, 158, 64,"24-6-2007", " tarteel.hussein24@gmail.com " , "Engineering ", "Single", 354841345);
        p.setName(" Tarteel ");
        p.setAddress(" Swizerland ");
        p.setNumber(549186655);
        p.setGender(" Female ");
        p.setWeight(64.5);
        p.setTall(156);
        p.setBirthday(" 24-6-2007 ");
        p.setMajor(" Engineer ");
        p.setSrc(" Single ");
        p.setNum(321654123);
        p.setGmail(" tarteel.hussein24@gmail.com ");

        System.out.println(p);



        Car c = new Car();
        c.setBrand("Toyota");
        c.setModel("Camry");
        c.setYear(2020);

        System.out.println(c);

        Student s = new Student();
        s.setName("Ali");
        s.setId(12345);
        s.setGrade(75);

        System.out.println(s);

        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(5);

        System.out.println(r);
        

    }}
