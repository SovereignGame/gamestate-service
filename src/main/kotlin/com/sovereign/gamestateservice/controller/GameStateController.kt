package com.sovereign.gamestateservice.controller

import com.sovereign.gamestateservice.service.GameStateService
import com.sovereign.gamestateservice.model.GameState
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/gameinstanceService")
class GameStateController(private val gameStateService: GameStateService) {

    @GetMapping("/{boardInvaderUsername}")
    fun getGameInstance(@PathVariable("boardInvaderUsername") boardInvaderUsername: String):ResponseEntity<GameState> {
        return gameStateService.getGameState(boardInvaderUsername).map { user ->
            ResponseEntity.ok(user)
        }.orElse(ResponseEntity.notFound().build())
    }

    @PostMapping("/")
    fun postGameInstance(@RequestBody gameState: GameState):Boolean {
        return gameStateService.createNewGameState(gameState)
    }
    @PutMapping("/")
    fun updateGameInstance(@RequestBody gameState: GameState):Boolean {
        return gameStateService.createNewGameState(gameState)
    }

    @DeleteMapping("/{username}")
    fun deleteMatch(@PathVariable("username") boardInvaderUsername:String):Boolean{
        return gameStateService.deleteGameState(boardInvaderUsername)
    }
}