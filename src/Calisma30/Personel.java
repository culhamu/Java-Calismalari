package Calisma30;

public class Personel {
    private String tcNo;
    private String isim;
    private String soyisim;
    private int yas;
    private int telNo;
    private String adres;

    public Personel() {
    }

    public Personel(String tcNo, String isim, String soyisim, int yas, int telNo, String adres) {
        this.tcNo = tcNo;
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.telNo = telNo;
        this.adres = adres;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getTelNo() {
        return telNo;
    }

    public void setTelNo(int telNo) {
        this.telNo = telNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return
                "tcNo='" + tcNo + '\'' +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", telNo=" + telNo +
                ", adres='" + adres + '\'';
    }
}
