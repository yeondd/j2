package com.j2.facade.hometheater.simple;

public class HomeTheaterFacade {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private Projector projector;
    private Light light;
    private Computer computer;
 
    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, Projector projector, Light light, Computer computer) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.projector = projector;
        this.light = light;
        this.computer = computer;
    }
 
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }
    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
    
    public void beginStudy(){
      System.out.println("Setting the Study Mode...");
      listenToRadio(71.9);
      light.on();
      computer.off();
    }
    
    public void endStudy(){
      System.out.println("Shutting down the Study Mode...");
      endRadio();
      light.on();
      computer.on();
    }
}