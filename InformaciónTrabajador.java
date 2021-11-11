/**
 *
 * @author Elver Andrew Quevedo Valer
 */
package molinoscomolsa;

public class InformaciónTrabajador {
    private String RecibirApellidos;
    private String RecibirNombres;
    private int RecibirHoras;
    private int RecibirValorHora;
    private String RecibirEstaCivil;
    
    public InformaciónTrabajador(String RecibirApellidos,
            String RecibirNombres,
            int RecibirHoras,
            int RecibirValorHora,
            String RecibirEstaCivil) {
        this.RecibirApellidos = RecibirApellidos;
        this.RecibirNombres = RecibirNombres;
        this.RecibirHoras = RecibirHoras;
        this.RecibirValorHora = RecibirValorHora;
        this.RecibirEstaCivil = RecibirEstaCivil;
    }

    
    public String getRecibirApellidos() {
        return RecibirApellidos;
    }

    public void setRecibirApellidos(String RecibirApellidos) {
        this.RecibirApellidos = RecibirApellidos;
    }

    public String getRecibirNombres() {
        return RecibirNombres;
    }

    public void setRecibirNombres(String RecibirNombres) {
        this.RecibirNombres = RecibirNombres;
    }

    public int getRecibirHoras() {
        return RecibirHoras;
    }

    public void setRecibirHoras(int RecibirHoras) {
        this.RecibirHoras = RecibirHoras;
    }

    public int getRecibirValorHora() {
        return RecibirValorHora;
    }

    public void setRecibirValorHora(int RecibirValorHora) {
        this.RecibirValorHora = RecibirValorHora;
    }

    public String getRecibirEstaCivil() {
        return RecibirEstaCivil;
    }

    public void setRecibirEstaCivil(String RecibirEstaCivil) {
        this.RecibirEstaCivil = RecibirEstaCivil;
    }

}
