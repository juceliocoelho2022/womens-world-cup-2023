package com.Dev_Jucelio.womensworldcup2023.service

import com.Dev_Jucelio.womensworldcup2023.domain.model.Team

interface SimulateService {
    fun simulate(team1Id: String, team2Id: String): Team

}