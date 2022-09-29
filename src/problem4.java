
import java.util.ArrayList;

public class problem4 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Seleccione producto");

        ArrayList<String> productos = new ArrayList<String>();
        productos.add("a. Zapatos");
        productos.add("b. Carteras");
        productos.add("c. Vestidos");
        productos.add("d. Sombreros");

        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }

        switch (productos) {
            case 'a':
                System.out.println("Cuantas desea?");

        }
    }
}
