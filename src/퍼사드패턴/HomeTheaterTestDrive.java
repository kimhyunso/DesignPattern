package 퍼사드패턴;

public class HomeTheaterTestDrive{
    public static void main(String[] args) {
        // 구성 요소 초기화

        Amplifier amplifier = new Amplifier();
        Screen screen = new Screen();
        StreamingPlayer player = new StreamingPlayer(amplifier);
        PopcornPopper popper = new PopcornPopper();
        Projector projector = new Projector(player);
        TheaterLights lights = new TheaterLights();
        Tuner tuner = new Tuner();


        HomeTheaterFacade homeTheater = 
        new HomeTheaterFacade(popper, projector, screen, player,
        lights, tuner, amplifier);

        homeTheater.watchMovie("인디아니 존스");
        System.err.println("=================================");
        homeTheater.endMovie();
    }
}