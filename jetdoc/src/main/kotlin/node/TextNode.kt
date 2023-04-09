package node

import canvas.Canvas
import canvas.CanvasContent

class TextNode : AbstractNode() {
    var text: String = ""
    override fun render(canvas: Canvas): CanvasContent {
        canvas.write(text = text)
        return canvas.render()
    }

}