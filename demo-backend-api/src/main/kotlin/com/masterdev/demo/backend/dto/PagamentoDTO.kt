package com.masterdev.demo.backend.dto

import java.math.BigDecimal

data class PagamentoDTO(
    val numeroPedido: String,
    val valor: BigDecimal,
    val produto: String
)