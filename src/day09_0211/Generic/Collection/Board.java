package day09_0211.Generic.Collection;

public class Board {
    private String subject;
    private String writer;
    private String content;

    public Board(String subject, String writer,String content) {
        this.subject = subject;
        this.writer = writer;
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
