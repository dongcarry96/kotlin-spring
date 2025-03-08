package com.dong.kotlin.domain.entity

import jakarta.persistence.*

@Entity
class ProjectSkill : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    var id: Long? = null


}