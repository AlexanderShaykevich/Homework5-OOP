package attachmentsType

import attachments.Video

class VideoAttachment(val video: Video) : Attachment() {
    override val type: String = "video"
}