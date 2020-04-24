package com.sovereign.gamestateservice.service

import com.sovereign.gamestateservice.model.GameState
import com.sovereign.gamestateservice.repository.GameStateRepository
import org.springframework.stereotype.Service
import java.util.*

//TODO add MUCH MORE logic, checks and functionality
@Service
class GameStateService(private val gameStateRepository: GameStateRepository){
    fun getGameState(boardInvaderUsername: String): Optional<GameState> {
        return gameStateRepository.findById(boardInvaderUsername)
    }

    fun createNewGameState(gameState:GameState):Boolean{
        gameStateRepository.save(gameState)
        return true
    }
    fun upadateGameState(gameState:GameState):Boolean{
        val oldGameState = gameStateRepository.findById(gameState.boardInvaderUsername).get()
        gameStateRepository.save(oldGameState.copy(engineSnapshot = gameState.engineSnapshot, boardSeed = gameState.boardSeed, playerPiece = gameState.playerPiece))
        return true
    }

    fun deleteGameState(boardInvaderUsername:String):Boolean{
        gameStateRepository.deleteById(boardInvaderUsername)
        return true
    }


}