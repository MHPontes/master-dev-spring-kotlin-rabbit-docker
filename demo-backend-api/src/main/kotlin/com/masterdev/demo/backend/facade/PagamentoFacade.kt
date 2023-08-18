package com.masterdev.demo.backend.facade

import com.masterdev.demo.backend.dto.PagamentoDTO
import org.springframework.stereotype.Service

@Service
class PagamentoFacade {
    fun solicitarPagamento(request: PagamentoDTO): String{
        return "Pagamento aguardando confirmacao..."
    }
}