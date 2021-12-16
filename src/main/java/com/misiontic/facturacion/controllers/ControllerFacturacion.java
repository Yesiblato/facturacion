package com.misiontic.facturacion.controllers;

import com.misiontic.facturacion.models.ClassFacturacion;

import com.misiontic.facturacion.repositories.FacturacionRepository;
import com.misiontic.facturacion.exceptions.FacturaNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ControllerFacturacion {
    private final FacturacionRepository facturacionRepository;

    //Constructor de la clase ControllerFacturacion
    public ControllerFacturacion(FacturacionRepository facturacionRepository){
        this.facturacionRepository = facturacionRepository;
    }

    //Conseguir la lista de Factura
    @GetMapping("/listFactura/{idDocumento}")
    List<ClassFacturacion> listFactura (@PathVariable String idDocumento){
        List<ClassFacturacion> lista = facturacionRepository.findByidDocumento(idDocumento);
        return (lista);
    }

    //Conseguir la información de un único usuario
    @GetMapping("/factura/{idFactura}")
    ClassFacturacion getFactura(@PathVariable String idFactura){
        return facturacionRepository.findById(idFactura)
                .orElseThrow(() -> new FacturaNotFoundException("No se encontró la factura: " + idFactura));
    }

    //Sirve para crear y actualizar
    @PostMapping("/createFactura")
    ClassFacturacion createFactura(@RequestBody ClassFacturacion factura){
        return facturacionRepository.save(factura);
    }

    @DeleteMapping("/deleteFactura/{idFactura}")
    String deleteFactura(@PathVariable String idFactura){
        ClassFacturacion deleteFactura = facturacionRepository.findById(idFactura).orElse(null);
        if (deleteFactura == null)
            throw new FacturaNotFoundException("Factura no encontrada");
        facturacionRepository.deleteById(idFactura);
        return "Borrado exitosoo";
    }
}
