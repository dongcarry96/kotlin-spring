package com.dong.kotlin.domain.repository

import com.dong.kotlin.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long>