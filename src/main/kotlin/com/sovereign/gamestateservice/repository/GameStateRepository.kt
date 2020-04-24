package com.sovereign.gamestateservice.repository

import com.sovereign.gamestateservice.model.GameState
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GameStateRepository: JpaRepository<GameState, String>{


}