package com.utn.trabajoPracticoPersistencia.entidades;

import com.utn.trabajoPracticoPersistencia.enums.estadoPedido;
import com.utn.trabajoPracticoPersistencia.enums.tipoEnvio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Pedido extends BaseEntidad{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPedido;
    estadoPedido estadoPedido;
    private Date fecha;
    tipoEnvio tipoEnvioPedido;
    private double total;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @Builder.Default
    private List<DetallePedido> detallespedidos = new ArrayList<>();
    private List<Factura> facturas = new ArrayList<>();


}
