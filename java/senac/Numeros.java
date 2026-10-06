import java.util.ArrayList;
import java.util.List;


public class Numeros {
    public static void main(String[] args) {
    
        List<Integer> notas = new ArrayList<>();
        notas.add(8); 
        notas.add(5);
        notas.add(7);
        notas.add(6);
        notas.add(4);
        int notaTotal = notas.get(0) + notas.get(1) + notas.get(2) + notas.get(3) + notas.get(4);
        System.out.println("Nota Total: " + notaTotal);

        int mediaFinal = notaTotal / notas.size();
        System.out.println("Média Final: " + mediaFinal);
    }
}   