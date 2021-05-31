package behavioral.mediator;

public class CommonChatUser implements ChatUser {

    private final Chat chat;

    public CommonChatUser(Chat chat){
        this.chat = chat;
    }

    @Override
    public void sendMsg(String msg) {
        chat.sendMsg(msg, this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println("User get msg from chat: "+ msg);
    }
}
