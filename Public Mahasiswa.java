public class Mahasiswa {
    private String nama;
    private String kelas;
    private int id;
    private int tanggalmasuk;

    public Mahasiswa(String nama, String kelas, int id, int tanggalmasuk) {
        this.nama = nama;
        this.kelas = kelas;
        this.id = id;
        this.tanggalmasuk = tanggalmasuk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTanggalmasuk() {
        return tanggalmasuk;
    }

    public void setTanggalmasuk(int tanggalmasuk) {
        this.tanggalmasuk = tanggalmasuk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", kelas='" + kelas + '\'' +
                ", id=" + id +
                ", tanggalmasuk=" + tanggalmasuk +
                '}';
    }
}
