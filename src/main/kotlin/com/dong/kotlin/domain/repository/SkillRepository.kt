package com.dong.kotlin.domain.repository

import com.dong.kotlin.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>