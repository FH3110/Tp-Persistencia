package com.utn.trabajoPracticoPersistencia.entidades;

import com.utn.trabajoPracticoPersistencia.enums.tipoProducto;
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
public class Producto extends BaseEntidad{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProducto;
    private int tiempoEstimadoCocina;
    private String denominacion;
    private double precioVenta;
    private double precioCompra;
    private int stockActual;
    private int stockMinimo;
    private String unidadMedida;
    private String receta;
    tipoProducto tipoProducto;

}
