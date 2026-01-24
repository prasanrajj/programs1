package programs.programs;
class Engine {
 void start() {
     System.out.println("Engine started ");
 }
}

class MusicPlayer {
 void play() {
     System.out.println("Playing music ");
 }
}

class Car {
 private Engine engine = new Engine(); // Composition
 private MusicPlayer musicPlayer;      // Aggregation

 // Aggregation: MusicPlayer is passed from outside (loose coupling)
 Car(MusicPlayer musicPlayer) {
     this.musicPlayer = musicPlayer;
 }
 void drive() {
     engine.start();
     System.out.println("Car is moving");
 }
 void enjoyMusic() {
     musicPlayer.play();
 }
}

public class HasARelationshipDemo {
 public static void main(String[] args) {

     // MusicPlayer exists independently (Aggregation)
     MusicPlayer sonyPlayer = new MusicPlayer();

     // Car "has-a" MusicPlayer (Aggregation) + Engine (Composition)
     Car car = new Car(sonyPlayer);

     car.drive();
     car.enjoyMusic();

     System.out.println("\nMusicPlayer can work even without car");
     sonyPlayer.play();
 }
}

