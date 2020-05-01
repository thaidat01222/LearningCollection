package LearnHashmap.FixProblem1_ChiDungDeThamKhao_KhongDuocCopy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<SMS> smsList;

    public User(String name) {
        this.name = name;
        this.smsList = new ArrayList<>();
    }

    public SMS randomSMS(String to) {
        SMS sms = new SMS();
        sms.setFrom(this.name);
        sms.setTo(to);
        sms.setContent(String.format("message from %s to %s at %s", name, to, LocalDate.now()));
        sms.setDate(LocalDate.now());
        return sms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SMS> getSmsList() {
        return smsList;
    }

    public void setSmsList(List<SMS> smsList) {
        this.smsList = smsList;
    }
}
