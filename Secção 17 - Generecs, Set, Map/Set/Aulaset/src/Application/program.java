package Application;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
public class program {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10)); // treeset ordena normal como o compareTo
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union cria um novo set "C" com o conteudo dos dois set
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection Cria um novo set "D" com elementos que existem nos 2 conjuntos
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference Cria um novo set "D" com elementos que nao existem no conjunto a e no b simultaneamente
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}