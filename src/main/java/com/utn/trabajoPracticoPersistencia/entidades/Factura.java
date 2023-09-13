package com.utn.trabajoPracticoPersistencia.entidades;

import com.utn.trabajoPracticoPersistencia.enums.formaPago;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Factura extends BaseEntidad{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFactura;

    private int numero;
    private Date fecha;
    private double Descuento;
    formaPago formaPagFactura;
    private int total;
}
