package com.dong.kotlin.domain.repository

import com.dong.kotlin.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long>