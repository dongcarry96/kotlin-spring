package com.dong.kotlin.domain.repository

import com.dong.kotlin.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>