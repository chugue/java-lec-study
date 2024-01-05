import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.exception.NurigoMessageNotReceivedException;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.service.DefaultMessageService;

public class MyApp {
    public static void main(String[] args) {
        DefaultMessageService messageService =
                NurigoApp.INSTANCE.initialize("NCSIHIQJASKUWZUN", "87PVP5GR1OYGT40K2SYU82UIOQ4MAMQN", "https://api.coolsms.co.kr");
// Message 패키지가 중복될 경우 net.nurigo.sdk.message.model.Message로 치환하여 주세요
        Message message = new Message();
        message.setFrom("01034220935");
        message.setTo("01034220935");
        message.setText("안녕하십니까, 김성훈입니다. 믿습니다. 선생님, 방향만 잘 잡아주시면 열심히 하겠습니다.");

        try {
            // send 메소드로 ArrayList<Message> 객체를 넣어도 동작합니다!
            messageService.send(message);
        } catch (NurigoMessageNotReceivedException exception) {
            System.out.println("오류발생 1");
            // 발송에 실패한 메시지 목록을 확인할 수 있습니다!
            System.out.println(exception.getFailedMessageList());
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println("오류발생 2");
            System.out.println(exception.getMessage());
        }
    }
}
