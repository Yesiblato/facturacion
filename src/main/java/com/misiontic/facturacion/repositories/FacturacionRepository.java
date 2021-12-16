package com.misiontic.facturacion.repositories;

import com.misiontic.facturacion.models.ClassFacturacion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FacturacionRepository extends  MongoRepository<ClassFacturacion,String>{
    /*
    List<ClassFacturacion> findByidFactura (String idFactura);
    List<ClassFacturacion> findByidPuntosTuris (String idPuntosTuris);
     */
    List<ClassFacturacion> findByidDocumento (String idDocumento);
}
