package composables

import NodeApplier
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeNode
import node.TextNode

@Composable
fun Text(text: String) {
    ComposeNode<TextNode,NodeApplier>(
        factory = ::TextNode
    ) {
        set(text) { this.text = it }
    }
}