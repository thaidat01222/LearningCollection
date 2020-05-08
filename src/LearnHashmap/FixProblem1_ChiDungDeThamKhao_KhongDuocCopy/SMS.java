package LearnHashmap.FixProblem1_ChiDungDeThamKhao_KhongDuocCopy;

import java.time.LocalDate;

public class SMS {
    private String from;
    private String to;
    private String content;
    private LocalDate date;
    public SMS() {

    }

    public SMS(String from, String to, String content, LocalDate date) {
        this.from = from;
        this.to = to;
        this.content = content;
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
