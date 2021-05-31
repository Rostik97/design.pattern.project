package behavioral.mediator;

public class Admin implements ChatUser {

    private final Chat chat;

    public Admin(Chat chat){
        this.chat = chat;
    }

    @Override
    public void sendMsg(String msg) {
        chat.sendMsg(msg, this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println("Admin get msg from chat: "+ msg);
    }
}
