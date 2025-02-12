package day10_0212.Pratice;

public class SeoulStudent {
    String name;
    int sno;

    int korea;
    int math;
    int english;
    int total;
    //this.total = (this.math + this.korea +this.english);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getKorea() {
        return korea;
    }

    public void setKorea(int korea) {
        this.korea = korea;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    SeoulStudent(String name,int sno,int korea,int english,int math,int total){
        this.name = name;
        this.sno = sno;
        this.korea = korea;
        this.english = english;
        this.math = korea;
        this.total = total;

    }

    public int getTotal() {
        return total;
    }

    SeoulStudent(){}
}
