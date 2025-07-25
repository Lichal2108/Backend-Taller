/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sm.dswTaller.ms.tallerAutomotriz.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sm.dswTaller.ms.tallerAutomotriz.model.TipoSolucion;
import sm.dswTaller.ms.tallerAutomotriz.reporistory.TipoSolucionRepository;

/**
 *
 * @author Ciro
 */
@Service
public class TipoSolucionService {
    @Autowired
    TipoSolucionRepository tipoSolucionRepository ;
    public List<TipoSolucion> getTipoSoluciones(){
        return tipoSolucionRepository.findAll();
    }
    
}
