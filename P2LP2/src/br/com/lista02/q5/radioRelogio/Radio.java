package br.com.lista02.q5.radioRelogio;

public interface Radio {
    public void setEmissora(String emissora, String tipoEmi);
    public String getEmissora();
    public String getTipoEmissora();
    public void setVolumeRadio(int vol);
    public int getVolumeRadio();
}
