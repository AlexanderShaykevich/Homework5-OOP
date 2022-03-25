object WallService {
    private var postId = 1
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        post.id = postId
        posts += post
        postId++
        return posts.last()
    }

    fun update(postToUpdate: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == postToUpdate.id) {
                posts[index] = post.copy(
                    ownerId = postToUpdate.ownerId,
                    fromId = postToUpdate.fromId,
                    createdBy = postToUpdate.createdBy,
                    text = postToUpdate.text,
                    replyOwnerId = postToUpdate.replyOwnerId,
                    replyPostId = postToUpdate.replyPostId,
                    friendsOnly = postToUpdate.friendsOnly,
                    comments = postToUpdate.comments,
                    copyright = postToUpdate.copyright,
                    likes = postToUpdate.likes,
                    reposts = postToUpdate.reposts,
                    views = postToUpdate.views,
                    postType = postToUpdate.postType,
                    signerId = postToUpdate.signerId,
                    canPin = postToUpdate.canPin,
                    canEdit = postToUpdate.canEdit,
                    isPinned = postToUpdate.isPinned,
                    markedAsAd = postToUpdate.markedAsAd,
                    isFavorite = postToUpdate.isFavorite,
                    donut = postToUpdate.donut,
                    postponedId = postToUpdate.postponedId
                )
                return true
            }
        }
        return false
    }

}