package com.peacecwz.contractgenerator.services

import com.peacecwz.contractgenerator.entities.ContractTemplateEntity
import com.peacecwz.contractgenerator.repositories.ContractTemplateRepository
import org.springframework.stereotype.Service

@Service
class ContractTemplateService(private var contractTemplateRepository: ContractTemplateRepository) {

    fun getContractTemplates(): List<ContractTemplateEntity> = contractTemplateRepository.findAll().toList();
}