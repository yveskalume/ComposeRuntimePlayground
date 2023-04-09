package canvas

sealed interface CanvasContent {
    data class Text(val text: String) : CanvasContent
    data class Page(val content: CanvasContent) : CanvasContent
}