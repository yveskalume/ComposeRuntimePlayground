package composables

import NodeApplier
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeNode
import node.PageNode
import node.TextNode

@Composable
fun Page(
    content: @Composable () -> Unit
) {
    ComposeNode<PageNode,NodeApplier>(
        factory = ::PageNode,
        update = {},
        content = content,
    )
}