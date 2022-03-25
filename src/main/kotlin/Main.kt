fun main() {

    val comment = Comments(1, true, true, true, true)
    val copyright = Copyright(1," ", " ", " ")
    val like = Likes(1,true, true, true)
    val repost = Reposts(1,true)
    val view = Views(1)
    val donut = Donut(true,1," ", false, " ")

    var post1 = Post(0, 1, 2, 1, 1648204060, "Some text1",
        1, 1,1, comment, copyright, like, repost, view,
        " ", 1,true, true, true, true,
        false, donut, 1)

    var post2 = Post(0, 1, 2, 1, 1648204060, "Some text2",
        1, 1,1, comment, copyright, like, repost, view,
        " ", 1,true, true, true, true,
        false, donut, 1)

    var post3 = Post(3, 1, 2, 1, 1648204060, "Some text3",
        1, 1,1, comment, copyright, like, repost, view,
        " ", 1,true, true, true, true,
        false, donut, 1)


    WallService.add(post1)
    println(WallService.update(post3))


}


