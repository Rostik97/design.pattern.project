package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {

    private ChatUser admin;

    private final List<ChatUser> chatChatUsers = new ArrayList<>();

    public void setAdmin(ChatUser admin) {
        this.admin = admin;
    }

    public void addUser(ChatUser chatUser) {
        chatChatUsers.add(chatUser);
    }

    @Override
    public void sendMsg(String msg, ChatUser chatUser) {
        chatChatUsers.forEach(chatUser1 -> chatUser1.getMsg(msg));
        admin.getMsg(msg);
    }
}
