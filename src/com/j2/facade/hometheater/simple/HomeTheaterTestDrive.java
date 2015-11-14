package com.j2.facade.hometheater.simple;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("My Amplifier");
        Tuner tuner = new Tuner("My AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("My DVD Player", amp);
        Projector projector = new Projector("My Projector", dvd);
        Light light = new Light("My Light");
        Computer computer = new Computer("My Computer");
 
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, projector, light, computer);
        homeTheater.watchMovie("My Movie Watching...");
        System.out.println("");
        homeTheater.endMovie();
        System.out.println("");
        homeTheater.beginStudy();
        System.out.println("");
        homeTheater.endStudy();
    }
}
