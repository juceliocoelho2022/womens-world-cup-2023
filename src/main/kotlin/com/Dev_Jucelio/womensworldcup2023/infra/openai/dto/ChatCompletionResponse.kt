package com.Dev_Jucelio.womensworldcup2023.infra.openai.dto

data class ChatCompletionResponse(
    val model: String,
    val choices: List<Choice>
)
