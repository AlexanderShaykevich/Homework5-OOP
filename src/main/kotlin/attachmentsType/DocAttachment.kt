package attachmentsType

import attachments.Doc

class DocAttachment(val doc: Doc) : Attachment() {
    override val type: String = "doc"
}