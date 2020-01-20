import java.util.ArrayList;
import java.util.List;

public class CollectionOfEggs {
    private List<Egg> eggs = new ArrayList<>();

    public void addEgg(Egg egg){
        this.eggs.add(egg);
    }

    public void removeEgg(){
        this.eggs.remove(0);
    }
}
