class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvd;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }
    public void watchMovie(String movie) {
        System.out.println("Preparing to watch a movie...");
        projector.on();
        projector.wideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        System.out.println("Movie is now playing!");
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
        System.out.println("Home theater is off.");
    }
}
