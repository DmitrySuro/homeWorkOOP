
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Trees implements Serializable {
    private List<Communication> communlist;

    public Trees(List<Communication> communlist) {
        this.communlist = communlist;
    }

    public Trees() {
        this(new ArrayList<>());
    }

    public List<Communication> getCommunlist() {
        return communlist;
    }

    public void setCommunlist(List<Communication> communlist) {
        this.communlist = communlist;
    }

    public void add_communication(Communication communication) {
        communlist.add(communication);
    }

    
    @Override
    public String toString() {
        return "Фамильное древо " +'\n' + communlist;
    }

    



}
