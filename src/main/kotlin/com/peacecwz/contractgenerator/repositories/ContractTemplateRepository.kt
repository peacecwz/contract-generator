package com.peacecwz.contractgenerator.repositories

import com.peacecwz.contractgenerator.entities.ContractTemplateEntity
import org.springframework.data.repository.CrudRepository

interface ContractTemplateRepository : CrudRepository<ContractTemplateEntity, Long> {
}