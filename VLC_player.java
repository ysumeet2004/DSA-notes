package ECC_COdes;

interface MediaPlayer {
    void play(String mediaName);
    void pause();
    void stop();
}

class MusicPlayer implements MediaPlayer {
    private String currentSong;

    public void play(String mediaName) {
        currentSong = mediaName;
        System.out.println("Playing song: " + currentSong);
    }

    public void pause() {
        System.out.println("Pausing song: " + currentSong);
    }

    public void stop() {
        System.out.println("Stopping song: " + currentSong);
        currentSong = null;
    }
}


class VideoPlayer implements MediaPlayer {
    private String currentVideo;

    public void play(String mediaName) {
        currentVideo = mediaName;
        System.out.println("Playing video: " + currentVideo);
    }

    public void pause() {
        System.out.println("Pausing video: " + currentVideo);
    }

    public void stop() {
        System.out.println("Stopping video: " + currentVideo);
        currentVideo = null;
    }
}

public class VLC_player {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.play("Kesariya");
        mp.pause();
        mp.stop();

        System.out.println();

        VideoPlayer vp = new VideoPlayer();
        vp.play("Java Tutorial.mp4");
        vp.pause();
        vp.stop();
    }
}
