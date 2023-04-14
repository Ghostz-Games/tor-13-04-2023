package TaskOne;

public class Main {
    public static void main(String[] args){

        TV tv = new TV();

        tv.setVolume(50); //TV not turned on.
        tv.turnOn(); //Tv is now turned on.
        tv.setVolume(50); //The tvs volume is now set to 50.
        tv.setVolume(-1); //The tv volume cannot go lower than 0%, the volume is now set to 0%
        tv.setVolume(101); //The volume cannot go higher than 100%, the volume is now set to 100%
        tv.setVolume(40); //The tvs volume is now set to 40.

        tv.setChannel(40); //The channel is now 40.
        tv.channelUp(); //The channel is now 41.
        tv.channelDown(); //the channel is now 40.
        tv.setChannel(0); //The channel is now 0.
        tv.channelDown(); //There is no channel lower than 0.
        tv.channelUp(); //The channel is now 1.

        tv.volumeUp(); //The volume is now 41
        tv.volumeDown(); //The volume is now 40.
        tv.setVolume(100); //the volume is now 100.
        tv.volumeUp(); //The tvs volume cannot go any higher.
        tv.setVolume(0); //The tvs volume is now 0.
        tv.volumeDown(); //The volume cannot go lower than 0%
        tv.setVolume(50); //The volume is now 50%
        tv.turnOff();




    }
}
