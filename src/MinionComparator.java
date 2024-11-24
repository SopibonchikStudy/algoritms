import java.util.Comparator;

public class MinionComparator implements Comparator<Minion> {
    @Override
    public int compare(Minion o1, Minion o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        if (nameCompare != 0){
            return nameCompare;
        }

        return o1.getSurname().compareTo(o2.getSurname());

    }
}
