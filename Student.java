
public class Student {
    private String name;
    private int rollNo;
    private String grade;
    public Student(String name,int rollNo,String grade){
        this.name=name;
        this.rollNo=rollNo;
        this.grade=grade;
    }
    public String getName(){
        return  name;
    }
    public int rollNo(){
        return  rollNo;
    }
    public String grade(){
        return grade;
    }
    public void setName(String name ){
        this.name=name;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public int getRollNumber(){
        return  rollNo;
    }
    @Override
    public String toString(){
        return  "Name: "+name+",Roll No. : "+rollNo+", Grade: "+grade;
    }



}
