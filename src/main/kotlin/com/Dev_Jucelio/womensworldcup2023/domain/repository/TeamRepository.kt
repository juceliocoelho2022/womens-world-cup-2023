package com.Dev_Jucelio.womensworldcup2023.domain.repository

import com.Dev_Jucelio.womensworldcup2023.domain.model.Team
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository : JpaRepository<Team, String>