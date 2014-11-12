package randommessagegenerator;

import java.util.*;

/**
 *
 * @author schra_000
 */
public class RandomMessageGenerator {

    private List<String> randomMessageList;

    public RandomMessageGenerator() {
        randomMessageList = new ArrayList<>();
    }

    public void displayList() {
        for (String s : randomMessageList) {
            System.out.println(s);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.randomMessageList);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RandomMessageGenerator other = (RandomMessageGenerator) obj;
        if (!Objects.equals(this.randomMessageList, other.randomMessageList)) {
            return false;
        }
        return true;
    }

    public String getRandomMessage() {
        Random rnd = new Random(System.nanoTime());
        int num = rnd.nextInt(randomMessageList.size());
        return randomMessageList.get(num);
    }

    public void removeDupes() {
        Set<String> dupes = new HashSet<>(randomMessageList);
        randomMessageList = new ArrayList<>(dupes);
    }

    public void addMessage(String message) {
        randomMessageList.add(message);
        removeDupes();
    }

    public void removeMessage(String message) {
        randomMessageList.remove(message);
    }

    public List<String> getRandomMessageList() {
        return randomMessageList;
    }

    public void setRandomMessageList(List<String> randomMessageList) {
        this.randomMessageList = randomMessageList;
    }
    
}
