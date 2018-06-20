package example1;

//Context
public class Radio {
    private IRadioStation station;
    void setRadioStation(IRadioStation station){
        this.station=station;
    }
    void nextStation(){
        if(station instanceof HitFM){
            setRadioStation(new AutoradioFM());
        }
        else if (station instanceof AutoradioFM){
            setRadioStation(new KissFM());
        }
        else if (station instanceof KissFM){
            setRadioStation(new HitFM());
        }
    }
    void play(){
        station.play();
    }
}
