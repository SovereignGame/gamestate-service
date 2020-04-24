package com.sovereign.gamestateservice.model

import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size


@Entity
data class GameState (
        @Id
        @Column(name = "boardInvaderUsername", unique = true, nullable = false)
        @NotNull
        @Size(min = 3, max = 32)
        var boardInvaderUsername: String = "",

        var engineSnapshot: String = "",

        var boardSeed : Long = 0,

        var playerPiece : String = ""
)