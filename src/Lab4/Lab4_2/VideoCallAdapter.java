package Lab4.Lab4_2;

class VideoCallAdapter implements Phone {
    private VideoCamera videoCamera;

    public VideoCallAdapter(VideoCamera videoCamera) {
        this.videoCamera = videoCamera;
    }

    @Override
    public void makeCall(String contact) {
        videoCamera.startVideoCall(contact);
    }
}

