import java.util.*;

public class lec_20230517 {

    public static void main(String args[]) {
        Random random = new Random();

        HashSet _hs = new HashSet();


        while(_hs.size() < 10) {
            _hs.add(random.nextInt(10));
        }

        for ( int i = 0 ; i < 10 ; i++) {
            _hs.add(random.nextInt(10));
        }

        Iterator _it = _hs.iterator();
        while ( _it.hasNext() ) {
            int _num = (int)_it.next();
            System.out.println(_num);
        }

        System.out.println("---------------");

        ArrayList _arr = new ArrayList<Integer>();
        for ( int i = 0 ; i < 10 ; i++) {
            _arr.add(random.nextInt(10));
        }

        System.out.println("ArrayList 출력");
        for ( int i = 0 ; i < _arr.size() ; i++ ) {
            System.out.println(i + "  : " + _arr.get(i));
        }
    }
}
