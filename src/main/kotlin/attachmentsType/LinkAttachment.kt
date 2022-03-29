package attachmentsType

import attachments.Link

class LinkAttachment(val link: Link) : Attachment() {
    override val type: String = "link"
}