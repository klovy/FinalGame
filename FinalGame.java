
package finalgame;

/**
 *
 * @author mikeb
 */
public class FinalGame {

    //adding for testing
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bank = 0;
        System.out.printf(Character.generateChar());
        System.out.printf(Sequence.One());
        do{
            System.out.printf(Sequence.Attack());
            bank += 25;
        }while(bank < 100);
        System.out.println(Sequence.Two());
        
    } 
    
}
