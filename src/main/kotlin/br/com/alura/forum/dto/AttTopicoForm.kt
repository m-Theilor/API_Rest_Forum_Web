package br.com.alura.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class AttTopicoForm(
    @field: NotNull val id: Long,
    @field: NotEmpty @Size(min = 5, max = 100) val titulo: String,
    @field: NotEmpty val mensagem: String,
)