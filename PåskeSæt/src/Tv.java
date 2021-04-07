public class Tv {
    private boolean isTurnedOn=false;
    private int volume;
    private int channel;
    public boolean turnOn() {
        if(isTurnedOn) {
            System.out.println("The tv is now off");
        } else {
            System.out.println("The tv is turned on");
        }
        return isTurnedOn;
    }

    public void setChannel(int channel) throws Exception {
        if(!isTurnedOn) {
            System.out.println("The Tv is now on channel: " + channel);
        } else throw new Exception("The Tv is off, you cannot choose channel");

    }

    public void setVolume(int volume) throws Exception {
        if(!isTurnedOn) {
            System.out.println("The Tvs audio level is now on: " + volume );
        } else throw new Exception("The Tv is off, you cannot set audio level");
    }

    public void channelUp() throws Exception {
        if(!isTurnedOn) {
            this.channel++;
            System.out.println("The channel is now: " + this.channel);
        }
    }

    public void volumeUp() {
        if(!isTurnedOn) {
            volume++;
            System.out.println("The volume is now: " + volume);
        }
    }
}
