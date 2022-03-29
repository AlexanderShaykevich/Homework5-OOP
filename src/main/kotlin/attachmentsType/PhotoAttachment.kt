package attachmentsType

import attachments.Photo

class PhotoAttachment(val photo: Photo) : Attachment() {
    override val type: String = "photo"
}