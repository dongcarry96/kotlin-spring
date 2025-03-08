package com.dong.kotlin.domain.repository

import com.dong.kotlin.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>