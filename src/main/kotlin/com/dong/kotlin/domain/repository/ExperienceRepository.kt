package com.dong.kotlin.domain.repository

import com.dong.kotlin.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long>