package attachmentsType

import attachments.Audio

class AudioAttachment(val audio: Audio) : Attachment() {
    override val type: String = "audio"
}