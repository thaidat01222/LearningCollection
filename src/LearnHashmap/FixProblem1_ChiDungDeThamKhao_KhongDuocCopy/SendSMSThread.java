package LearnHashmap.FixProblem1_ChiDungDeThamKhao_KhongDuocCopy;

import java.util.Random;

public class SendSMSThread extends Thread {
    private User[] users;
    private SMSCenter smsCenter;
    private Random random;
    private String threadNumber;

    public SendSMSThread(String threadNumber, User[] users, SMSCenter smsCenter) {
        this.users = users;
        this.smsCenter = smsCenter;
        this.random = new Random();
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int userFromIdx = random.nextInt(users.length);
                int userToIdx = random.nextInt(users.length);
                User userFrom = users[userFromIdx];
                User userTo = users[userToIdx];
                SMS sms = userFrom.randomSMS(userTo.getName());
                smsCenter.sendSMStoCenter(sms);
                System.out.println("[" + this.threadNumber + "]" + String.format(": from %s to %s: sending...", userFrom.getName(), userTo.getName()));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
