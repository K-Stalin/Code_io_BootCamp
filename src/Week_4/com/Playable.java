package Week_4.com;

interface Playable {
    void play();
    void pause();
}

class AudioPlayer implements  Playable{

    @Override
    public void  play()
    {
        System.out.println("AudioPlayer via play");
    }

    @Override
    public void pause() {
        System.out.println("AudioPlayer via pause");
    }
}

class VideoPlayer implements  Playable
{
    @Override
    public void  play()
    {
        System.out.println("VideoPlayer via play");

    }

    @Override
    public void pause() {
        System.out.println("VideoPlayer via pause");
    }
}

class PlayableMain{
    public static void main(String[] args) {
        Playable playable;
        playable = new AudioPlayer();
        playable.play();
        playable.pause();

        System.out.println("-----------------------------------------");
        playable = new VideoPlayer();
        playable.pause();
        playable.play();
    }
}
