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
/*        
        try {
            archivo = new FileOutputStream ("Reporte de trabajadores.pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);
            
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Reporte de trabajadores de la empresa"));
            
            documento.add(Chunk.NEWLINE);
            
            Paragraph texto = new Paragraph("El presente documento ha sido realizado para brindar"
                    + " un breve reporte sobre el pago a los trabajadores de la empresa Molinos"
                    + " COMOLSA para lo cuál se presentarà la siguiente tabla donde se especificará"
                    + " el tiempo de trabajo de los trabajadores reportados:");
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);
            
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha:" + fechaActual()));
            
            PdfPTable tabla = new PdfPTable(9);
            tabla.setWidthPercentage(100);
            PdfPCell apellido = new PdfPCell(new Phrase("Apellido"));
            apellido.setBackgroundColor(BaseColor.CYAN);
            PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
            nombre.setBackgroundColor(BaseColor.CYAN);
            PdfPCell estacivil = new PdfPCell(new Phrase("Estado Civil"));
            estacivil.setBackgroundColor(BaseColor.CYAN);
            PdfPCell horas = new PdfPCell(new Phrase("Horas"));
            horas.setBackgroundColor(BaseColor.CYAN);
            PdfPCell valor = new PdfPCell(new Phrase("Valor p/h"));
            valor.setBackgroundColor(BaseColor.CYAN);
            PdfPCell sueldobruto  = new PdfPCell(new Phrase("Sueldo Bruto"));
            sueldobruto.setBackgroundColor(BaseColor.CYAN);
            PdfPCell descuento = new PdfPCell(new Phrase("Descuento SNP"));
            descuento.setBackgroundColor(BaseColor.CYAN);
            PdfPCell bonificacion = new PdfPCell(new Phrase("Bonificación"));
            bonificacion.setBackgroundColor(BaseColor.CYAN);
            PdfPCell sueldoneto  = new PdfPCell(new Phrase("Sueldo Neto"));
            sueldoneto.setBackgroundColor(BaseColor.CYAN);
            
            tabla.addCell(apellido);
                tabla.addCell(nombre);
                tabla.addCell(estacivil);
                tabla.addCell(horas);
                tabla.addCell(valor);
                tabla.addCell(sueldobruto);
                tabla.addCell(descuento);
                tabla.addCell(bonificacion);
                tabla.addCell(sueldoneto);
            
            for ( int i = 0; i < modeloTabla.getRowCount(); i++) {
                apellido = (PdfPCell) modeloTabla.getValueAt(i, 0);
                nombre = (PdfPCell) modeloTabla.getValueAt(i, 1);
                estacivil = (PdfPCell) modeloTabla.getValueAt(i,2);
                
                
            }
            
            documento.add(tabla);
            
            documento.close();
        } catch (FileNotFoundException | DocumentException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el reporte" + e.getMessage());
        }*/
}
