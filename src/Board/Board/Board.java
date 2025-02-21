package Board.Board;

import java.time.LocalDateTime;

public class Board {
    private int bno;
    private String bititle;
    private String bcontent;
    private String bwriter;
    private LocalDateTime bdate;



    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBititle() {
        return bititle;
    }

    public void setBititle(String bititle) {
        this.bititle = bititle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public LocalDateTime getBdate() {
        return bdate;
    }


    public void setBdate(LocalDateTime bdate) {
        this.bdate = bdate;
    }



}
