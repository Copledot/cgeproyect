package Dominio

class Boleta (
    var idCliente: String,
    var anio: Int,
    var mes: Int,
    var kwhTotal: Double,
    var detalle: TarifaDetalle,
    var estado: EstadoBoleta

) {

    public fun PdfTable {

    }


}