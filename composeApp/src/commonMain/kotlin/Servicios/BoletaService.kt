package Servicios

import Persistencia.BoletaRepositorio
import Persistencia.ClienteRepositorio
import Persistencia.LecturaRepositorio
import Persistencia.MedidorRepositorio

class BoletaService (
    var clientes: ClienteRepositorio,
    var medidores: MedidorRepositorio,
    var lecturas: LecturaRepositorio,
    var boletas: BoletaRepositorio,
    var tarifas: TarifaService

) {
}