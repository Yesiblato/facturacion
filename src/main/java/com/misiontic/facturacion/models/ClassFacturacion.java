package com.misiontic.facturacion.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class ClassFacturacion {

    @Id
    private String idFactura;
    private String idDocumento;
    private String idPuntoTuris;
    private Date fecha;
    private float total;

    public ClassFacturacion(String idFactura, String idPuntoTuris, Date fecha, float total, String idDocumento) {
        this.idFactura = idFactura;
        this.idPuntoTuris = idPuntoTuris;
        this.fecha = fecha;
        this.total = total;
        this.idDocumento = idDocumento;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getIdPuntoTuris() {
        return idPuntoTuris;
    }

    public void setIdPuntoTuris(String idPuntoTuris) {
        this.idPuntoTuris = idPuntoTuris;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getidDocumento() {
        return idDocumento;
    }

    public void setidDocumento(String idDocumento) {
        this.idDocumento = this.idDocumento;
    }
}
