package com.peacecwz.contractgenerator.controllers

import com.peacecwz.contractgenerator.services.ContractTemplateService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/contract-templates")
class ContractTemplatesController(private var contractTemplateService: ContractTemplateService) {

    @GetMapping
    fun getContractTemplates() = contractTemplateService.getContractTemplates();
}