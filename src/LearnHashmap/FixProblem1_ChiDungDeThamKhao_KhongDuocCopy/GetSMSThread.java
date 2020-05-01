package LearnHashmap.FixProblem1_ChiDungDeThamKhao_KhongDuocCopy;

import java.util.List;

public class GetSMSThread extends Thread {
    private User user;
    private SMSCenter smsCenter;

    public GetSMSThread(User user, SMSCenter smsCenter) {
        this.user = user;
        this.smsCenter = smsCenter;
    }

    @Override
    public void run() {
        while (true) {
            try {
                List<SMS> receivedSMS = smsCenter.getMessage(user.getName());
                if (receivedSMS != null) {
                    for (SMS sms : receivedSMS) {
                        System.out.println("[" + user.getName() + "] sms from " + sms.getFrom() + " received");
                    }
                    user.getSmsList().addAll(receivedSMS);
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
