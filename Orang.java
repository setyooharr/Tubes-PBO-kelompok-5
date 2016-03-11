package tubespbo;

public abstract class Orang {
    private String id;
    private String nama;
    private String ttl;
    private String alamat;
    private String noHp;
    private String email;

    public Orang(String id, String nama) {
        setId(id);
        setNama(nama);
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTtl() {
        return ttl;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getEmail() {
        return email;
    }
}
