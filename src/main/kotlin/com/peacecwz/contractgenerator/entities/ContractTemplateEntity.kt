package com.peacecwz.contractgenerator.entities

import javax.persistence.*

@Entity
class ContractTemplateEntity(
        @Id @GeneratedValue var id: Long? = null
)