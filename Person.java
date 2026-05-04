
public class Person {
    private String name;
    private String gender;
    private String address;
    private int number;
    private double tall;
    private double weight;
    private String birthday;
    private String gmail;
    private String major;
    private String src;
    private int num;

    public Person(String name, String gender, String address, int number,
                  double tall, double weight, String birthday,
                  String gmail, String major, String src, int num){
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.number = number;
        this.tall = tall;
        this.weight = weight;
        this.birthday = birthday;
        this.gmail = gmail;
        this.major = major;
        this.src = src;
        this.num = num;

    }
    public Person(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getTall() {
        return tall;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getGmail() {
        return gmail;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getSrc() {
        return src;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    public String toString() {
        return "Name: " + getName() +
                "the phone num "+ getNumber()+
                "\nGender: " + getGender() +
                "\nAddress: " + getAddress() +
                "\nNumber: " + getGender() +
                "\nTall: " + getTall() +
                "\nWeight: " + getWeight() +
                "\nBirthday: " + getBirthday() +
                "\nEmail: " + getGmail() +
                "\nMajor: " + getMajor() +
                "\nSrc: " + getSrc() +
                "\nNum: " + getNum() ;
    }













}
