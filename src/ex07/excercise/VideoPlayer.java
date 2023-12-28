package ex07.excercise;

public class VideoPlayer implements Controllable{
    @Override
    public void play() {
        System.out.println("재생중입니다.");
    }
    @Override
    public void stop() {
        System.out.println("재생이 멈췄습니다.");
    }
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer();
        vp.play();
        vp.stop();
    }
}
