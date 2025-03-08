package com.dong.kotlin.domain.repository

import com.dong.kotlin.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long>