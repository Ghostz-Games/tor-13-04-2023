package TaskOne;

public class TV {

    private boolean on = false;
    private int channel = 0;
    private int volume = 0;


    public TV(){}

    public void turnOn(){

        if(!on){
            on = true;
            System.out.println("Tv is now turned on!");
        }else{
            System.out.println("Tv is already on!");
        }
    }

    public void turnOff(){
        if(on){
            on = false;
            System.out.println("Tv is now turned off!");
        }else {
            System.out.println("Tv is already off!");
        }
    }


    public void setChannel(int channel){
        if(on) {
            this.channel = channel;
            System.out.println("Switched channel to: " + channel);
        }else{
            System.out.println("The tv is not turned on.");
        }
    }

    public void setVolume(int volume){
        if(on) {
            if(volume > 100) {
                System.out.println("The tv volume cannot go higher than 100%");
                this.volume = 100;
                System.out.println("The tvs volume is now set to: " + this.volume);
            }else if(volume < 0){
                System.out.println("The tv volume cannot go lower than 0%");
                this.volume = 0;
                System.out.println("The tvs volume is now set to: " + this.volume);
            }else{
                this.volume = volume;
                System.out.println("The tvs volume is now set to: " + this.volume);
            }
        }else{
            System.out.println("The tv is not turned on.");
        }
    }


    public void channelUp(){
        if(on) {
            this.channel += 1;
            System.out.println("The channel is now " + this.channel);
        }else{
            System.out.println("Tv is not on");
        }
    }

    public void channelDown(){
        if(on) {
            if (!(this.channel == 0)) {
                this.channel -= 1;
                System.out.println("The channel is now " + this.channel);
            }else{
                System.out.println("There is no channel lower than 0");
            }
        }else {
            System.out.println("Tv is not on");
        }
    }

    public void volumeUp(){
        if(on){
            if(!(this.volume == 100)){
                this.volume += 1;
                System.out.println("The volume is now: "+this.volume);
            }else{
                System.out.println("The tv volume cannot go any higher");
            }
        }else{
            System.out.println("Tv is not on.");
        }
    }

    public void volumeDown(){
        if(on){
            if(!(this.volume == 0)){
                this.volume -= 1;
                System.out.println("The volume is now: "+this.volume);
            }else {
                System.out.println("the volume cannot go lower than 0%");
            }
        }else{
            System.out.println("Tv is not on.");
        }
    }

}
