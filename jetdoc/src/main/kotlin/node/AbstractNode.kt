package node

import canvas.Canvas
import canvas.CanvasContent

abstract class AbstractNode {
    val children = mutableListOf<AbstractNode>()
    abstract fun render(canvas: Canvas) : CanvasContent
}