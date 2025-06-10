package br.dev.gustavosouza.breakingnews

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform