package canvas

interface Canvas {
    fun render() : CanvasContent
    fun write(text: String)
}