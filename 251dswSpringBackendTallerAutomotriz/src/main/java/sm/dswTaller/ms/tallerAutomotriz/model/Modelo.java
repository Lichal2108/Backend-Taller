
package sm.dswTaller.ms.tallerAutomotriz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // permite realizar codigo limpio
@Entity//permite realizat las operaciones CRUD
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="modelo")
public class Modelo {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column(name="id_modelo")
    private int idModelo;
    
    private String nombre;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "marca_id", referencedColumnName = "id_marca")
    private Marca marca;
    
    
    
    
    
    
    
    
    
}
