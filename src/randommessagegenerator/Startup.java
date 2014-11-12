package randommessagegenerator;

/**
 *
 * @author schra_000
 */
public class Startup {
    
    public static void main(String[] args) {
        
        RandomMessageGenerator rmg = new RandomMessageGenerator();
                
        rmg.addMessage("Beer");
        rmg.addMessage("Wine");
        rmg.addMessage("Liquor");
        rmg.addMessage("Coffee");
        rmg.addMessage("Water");
        rmg.addMessage("Milk");
        rmg.addMessage("Tea");
        rmg.addMessage("Coffee");
        rmg.addMessage("Beer");
        rmg.addMessage("Wine");
        rmg.addMessage("Liquor");
        rmg.addMessage("Coffee");
        rmg.addMessage("Water");
        rmg.addMessage("Milk");
        rmg.addMessage("Tea");
        rmg.addMessage("Coffee");
        
        System.out.println("List with Duplicates:");
        rmg.displayList();
        
        rmg.removeDupes();
        System.out.println("List without duDuplicatespes:");
        rmg.displayList();
        
        System.out.println("Random message:");
        System.out.println(rmg.getRandomMessage());
        
        rmg.removeMessage("Dog");
        rmg.displayList();
        
    }
}
