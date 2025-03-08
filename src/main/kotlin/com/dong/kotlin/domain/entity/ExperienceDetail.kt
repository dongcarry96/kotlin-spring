package com.dong.kotlin.domain.entity

import jakarta.persistence.*

@Entity
class ExperienceDetail : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experienceDetail_id")
    var id: Long? = null


}