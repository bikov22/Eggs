import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Boiler {
    private LocalDateTime endTime;
    private String stateOfBoil = "Not ready";

    public Boiler(){
    }

    public void startBoiling(int minutes){
        this.endTime = LocalDateTime.now().plusMinutes(minutes);
    }

    public String areEggsReady(){
        if (LocalDateTime.now().isAfter(endTime)){
            this.stateOfBoil = "Ready";
            return stateOfBoil;
        }
        else{
            return stateOfBoil;
        }
    }

    public void stopBoiling(){
        this.stateOfBoil = "Not ready";
        this.endTime = null;
    }
}
