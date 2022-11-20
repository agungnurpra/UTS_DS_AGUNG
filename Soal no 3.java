import java.util.ArrayList;
import java.util.List;

public class no3 {
  public static void uts_no3(){


      List<Mahasiswa> MahasiswaList = new ArrayList<>();
      MahasiswaList.add(new Mahasiswa ("Aziz","Maulana", 1280, 13));
      MahasiswaList.add(new Mahasiswa ("Nanda", "Gustira", 1351, 16));
      MahasiswaList.add(new Mahasiswa ("Zacky", "Wicaksono", 713, 91));
      MahasiswaList.add(new Mahasiswa ("Fachrizal", "Nurrahman", 228, 23));
      MahasiswaList.add(new Mahasiswa ("Asep", "Jajat", 870, 65));

      
      MahasiswaList.remove(0);
      MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa));
      System.out.println("banyak data = " + MahasiswaList.size());


  }

}