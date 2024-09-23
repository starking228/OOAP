package Lab4.Lab4_2;

public class SkypeApp {
    public static void main(String[] args) {
        Phone simplePhone = new SimpleCall();
        simplePhone.makeCall("Ihor Chychula");


        VideoCamera camera = new VideoCamera();
        Phone videoCall = new VideoCallAdapter(camera);
        videoCall.makeCall("Iryna Chychula");
    }
}

