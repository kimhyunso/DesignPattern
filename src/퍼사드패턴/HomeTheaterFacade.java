package 퍼사드패턴;

public class HomeTheaterFacade{

    private PopcornPopper popper;
    private Projector projector;
    private Screen screen;
    private StreamingPlayer player;
    private TheaterLights lights;
    private Tuner tuner;
    private Amplifier amplifier;

    public HomeTheaterFacade(PopcornPopper popper,
                            Projector projector,
                            Screen screen,
                            StreamingPlayer player,
                            TheaterLights lights,
                            Tuner tuner,
                            Amplifier amplifier){
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.player = player;
        this.lights = lights;
        this.tuner = tuner;
        this.amplifier = amplifier;
        this.tuner = tuner;
    }



    public void watchMovie(String movie){
        System.out.println("영화 볼 준비 중");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamPlayer(player);
        amplifier.setSurroundSound();
        amplifier.setVolumn(5);
        player.on();
        player.play(movie);
    }

    public void endMovie(){
        System.out.println("홈시어터를 끄는 중");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        player.stop();
        player.off();
    }

    public void listenToRadio(){
        amplifier.on();
        amplifier.setStereoSound();
        amplifier.setVolumn(5);
        tuner.on();
        tuner.setAm(amplifier);
        tuner.setFrequency(144);
    }

    public void endRadio(){
        amplifier.off();
        tuner.off();
    }
}