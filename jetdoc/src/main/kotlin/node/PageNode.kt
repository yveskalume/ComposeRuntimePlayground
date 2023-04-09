package node

import canvas.Canvas
import canvas.CanvasContent

class PageNode : AbstractNode() {
    override fun render(canvas: Canvas): CanvasContent {
        val content = children[0].render(canvas)
        return CanvasContent.Page(content)
    }

}