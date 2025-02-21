package day17_0219.Board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter

@AllArgsConstructor
public class Board {
    private int bno;
    private String bititle;
    private String bcontent;
    private String bwriter;
    private String bdate;

    Board(){}
    Board(int bno,String bititle,String bcontent,String bwriter,String bdate){
        this.bno = bno;
        this.bititle = bititle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
        this.bdate = bdate;
    }
    public void setBno(int bno){this.bno = bno;}

    public void setBititle(String bititle){this.bititle = bititle;}

    public void setBcontent(String bcontent){this.bcontent = bcontent;}

    public void setBwriter(String bwriter){this.bwriter = bwriter;}

    public void setBdate(String bdate){this.bdate = bdate;}

    public int getBno(){return bno;}

    public String getBititle(){return bititle;}

    public String getBcontent(){return bcontent;}

    public String getBwriter(){return bwriter;}

    public String getBdate(){return bdate;}

    @Override
    public String toString() {
        return this.bno +" " + this.bwriter + " " + this.bdate + " " +this.bititle;
    }
    ArrayList<Board> b1 = new ArrayList<Board>();

//    public void create1(){
//        b1.add();
//    }
}
