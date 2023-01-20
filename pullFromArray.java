/**
 * pullFromArray
 */
public class pullFromArray {

    public static void main(String[] args) {
        String[] list = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"}; 
        for (int i = 0; i < list.length; i++) {
            
            if (list[i].endsWith("ing")) {
                System.out.println(list[i]);
            }
        }
    }
}