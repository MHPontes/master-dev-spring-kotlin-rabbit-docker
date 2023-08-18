package com.masterdev.demo.backend.api

import com.masterdev.demo.backend.dto.PagamentoDTO
import com.masterdev.demo.backend.facade.PagamentoFacade
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pagamentos")
class PagamentoApi {
    @Autowired
    private lateinit var pagamentoFacade: PagamentoFacade

    @PostMapping
    fun processar(@RequestBody request: PagamentoDTO): String {
        return pagamentoFacade.solicitarPagamento(request)
    }

}
