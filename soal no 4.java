import java.util.Iterator;
import java.util.LinkedList;

public class no4 {

    public static void uts_no4(){
        Mahasiswa Aziz = new Mahasiswa("Aziz", "Maulana", 1280,13);
        Mahasiswa Nanda = new Mahasiswa("Nanda", "Gustira", 1351, 16);
        Mahasiswa Zacky = new Mahasiswa("Zacky", "Wicaksono", 713, 91);
        Mahasiswa Fachrizal = new Mahasiswa("Fachrizal", "Nurrahman", 228, 23);
        Mahasiswa Asep = new Mahasiswa("Asep","Jajat", 870, 65);

        LinkedList<Mahasiswa> list = new LinkedList<>();
        list.addFirst(Aziz);
        list.addFirst(Nanda);
        list.addFirst(Zacky);
        list.addFirst(Fachrizal);
        list.addFirst(Asep);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.print("<=>");
        }

        System.out.println("null");

        list.addLast(Asep);
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        
    }


}