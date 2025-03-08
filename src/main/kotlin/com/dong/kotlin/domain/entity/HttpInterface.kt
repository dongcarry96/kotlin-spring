package com.dong.kotlin.domain.entity

import jakarta.persistence.*

@Entity
class HttpInterface : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "httpInterface_id")
    var id: Long? = null


}