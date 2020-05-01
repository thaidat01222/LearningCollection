package LearnHashmap.FixProblem1_ChiDungDeThamKhao_KhongDuocCopy;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private User[] users;
    private SMSCenter smsCenter;
    private List<SendSMSThread> sendSMSThreads;
    private List<GetSMSThread> getSMSThreads;


    public static void main(String[] args) {
        Application application = new Application();

        application.smsCenter = new SMSCenter();
        application.initUser(10);

        application.initSendingSMSThread(100);
        application.initGetSMSThread();

        application.startSendingSMS();
        application.startGettingSMS();

    }

    public void initUser(int size) {
        users = new User[size];
        for (int i = 0; i < size; i++) {
            User user = new User("user " + (i + 1));
            users[i] = user;
        }
    }

    public void initSendingSMSThread(int size) {
        sendSMSThreads = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            sendSMSThreads.add(new SendSMSThread("SEND " + (i + 1), users, smsCenter));
        }
    }

    public void initGetSMSThread() {
        getSMSThreads = new ArrayList<>();
        for (User user : users) {
            getSMSThreads.add(new GetSMSThread(user, smsCenter));
        }
    }

    public void startSendingSMS() {
        for (SendSMSThread sendSMSThread : sendSMSThreads) {
            sendSMSThread.start();
        }
    }

    public void startGettingSMS() {
        for (GetSMSThread getSMSThread : getSMSThreads) {
            getSMSThread.start();
        }
    }
}
