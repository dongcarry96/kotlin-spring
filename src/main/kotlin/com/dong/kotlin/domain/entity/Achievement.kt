package com.dong.kotlin.domain.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
class Achievement(
    title: String,
    description: String,
    host: String,
    isActive: Boolean,
    achievedDate: LocalDate
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    var id: Long? = null

    var title: String = title

    var description: String = description

    var achievement: LocalDate? = null

    var host: String = host

    var isActive: Boolean = isActive


}