package br.com.lista02.q5.radioRelogio;

public class RadioRelogio implements Radio, Relogio{
    
    private String horario;
    private boolean despertar;
    private String horarioAlarme;
    private String emissora;
    private String tipoEmissora;
    private int volumeRadio;
    private int volumeRelogio;

    public RadioRelogio() {
        this.horario = "00:00";
        this.despertar = false;
        this.volumeRadio = 0;
        this.volumeRelogio = 0;
    }
    
    @Override
    public void setEmissora(String emissora, String tipoEmi) {
        this.emissora = emissora;
        this.tipoEmissora = tipoEmi;
    }

    @Override
    public String getEmissora() {
        return this.emissora;
    }
    
    @Override
    public String getTipoEmissora() {
        return this.tipoEmissora;
    }

    @Override
    public void setVolumeRadio(int vol) {
        this.volumeRadio = vol;
    }

    @Override
    public int getVolumeRadio() {
        return this.volumeRadio;
    }

    @Override
    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String getHorario() {
        return this.horario;
    }

    @Override
    public void setHorarioAlarme(String horario) {
        this.horarioAlarme = horario;
    }

    @Override
    public String getHorarioAlarme() {
        return this.horarioAlarme;
    }

    @Override
    public void ligarAlarme() {
        this.despertar = true;
    }
    
    @Override
    public void desligarAlarme() {
        this.despertar = false;
    }

    @Override
    public void setVolumeRelogio(int vol) {
        this.volumeRelogio = vol;
    }

    @Override
    public int getVolumeRelogio() {
        return this.volumeRelogio;
    }
}
