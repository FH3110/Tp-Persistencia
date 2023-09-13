package com.utn.trabajoPracticoPersistencia.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class DetallePedido extends BaseEntidad{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetallePedido;

    private int cantidad;
    private double subtotal;
    private Producto producto;
}
