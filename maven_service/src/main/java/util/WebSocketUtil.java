package util;

import org.springframework.web.socket.server.standard.SpringConfigurator;
import po.Order;
import po.Sender;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.rmi.server.ExportException;

@ServerEndpoint(value ="/websocketUtil/{sender}",configurator = SpringConfigurator.class)
public class WebSocketUtil {
    private static Session session;
    private static Sender sender;

    @OnOpen
    public static void onOpen(@PathParam("sender") Sender sender, Session session) {
        session = session;
        sender = sender;

    }

    @OnClose
    public static void onClose() {

    }

    @OnMessage
    public static void onMessage(String message, Session session) {

    }

    public static boolean sendMessageToSender(Sender sender, String message) {
        try {
            WebSocketUtil webSocketUtil = new WebSocketUtil();
            webSocketUtil.session.getBasicRemote().sendText(message);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
