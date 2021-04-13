package vo;

public class Student {
    private int Sid;
    private String name;
    private String mail;
    private String password;
    private String gender;
    private int year;
    private int height;
    private int weight;
    private int level;
    private String date;
    private int Tid = 0;

    public Student(int a,String b){
        Sid = a;
        name = b;
    }
    public void setSid(int id) {this.Sid = id;}
    public void setName(String name) {this.name = name;}
    public int getSid() {
        return Sid;
    }
    public String getName(){
        return name;
    }
}
