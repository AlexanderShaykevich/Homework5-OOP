fun main() {

    val comment = Comments(1, true, true, true, true)
    val copyright = Copyright(1," ", " ", " ")
    val like = Likes(1,true, true, true)
    val repost = Reposts(1,true)
    val view = Views(1)
    val donut = Donut(true,1," ", false, " ")

    var post = Post(0,1,2,3,4,"Text here", 5, 6,
        7, comment, copyright, like, repost, view, " ", postSource = null, geo = null,
        8, copyHistory = null, true, true, true, false, false,
        donut, 9)

    var updatedPost = Post(0,1,2,3,4,"Text here2", 5, 6,
        7, comment, copyright, like, repost, view, " ", postSource = null, geo = null,
        8, copyHistory = null, true, true, true, false, false,
        donut, 9)


    WallService.add(post)
    println(WallService.update(updatedPost))


}


