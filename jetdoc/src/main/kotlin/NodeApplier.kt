import androidx.compose.runtime.AbstractApplier
import node.AbstractNode

class NodeApplier(root: AbstractNode) : AbstractApplier<AbstractNode>(root) {
    override fun insertBottomUp(index: Int, instance: AbstractNode) {
        // is built top to Down
    }

    override fun insertTopDown(index: Int, instance: AbstractNode) {
        current.children.add(index,instance)
    }

    override fun move(from: Int, to: Int, count: Int) {
        current.children.move(from, to, count)
    }

    override fun onClear() {
        root.children.clear()
    }

    override fun remove(index: Int, count: Int) {
        current.children.remove(index, count)
    }

}