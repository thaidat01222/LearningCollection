package LearnHashmap.FixProblem1_ChiDungDeThamKhao_KhongDuocCopy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class SMSCenter {
    private ConcurrentHashMap<String, List<SMS>> smsCollections;

    public SMSCenter() {
        this.smsCollections = new ConcurrentHashMap<>();
    }

    public void sendSMStoCenter(SMS sms) {
        String destinationUser = sms.getTo();
        List<SMS> pendingSMS = smsCollections.getOrDefault(destinationUser, new ArrayList<>());
        pendingSMS.add(sms);
        smsCollections.put(destinationUser, pendingSMS);
        System.out.println("[SMS_CENTER] sms from " + sms.getFrom() + ": received");
    }

    public List<SMS> getMessage(String username) {
        return smsCollections.remove(username);
    }
}
