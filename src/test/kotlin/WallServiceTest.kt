import org.junit.After
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before


class WallServiceTest {

    @Test
    fun addNew() {
        val examplePost = Post(
            0, 1, 2, 1, 1648204060, "Some text",
            1, 1, 1, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 1, true, true, true, true,
            false, Donut(true, 1, " ", true, " "), 1
        )
        val expected = 1

        val result = WallService.add(examplePost).id

        assertEquals(expected, result)
    }

    @Test
    fun updateExistingTrue() {
        WallService.add(Post(0, 1, 2, 1, 1648204060, "Some text",
            1, 1, 1, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 1, true, true, true, true,
            false, Donut(true, 1, " ", true, " "), 1
        ))
        WallService.add(Post(0, 1, 2, 1, 1648204060, "Some text",
            1, 1, 1, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 1, true, true, true, true,
            false, Donut(true, 1, " ", true, " "), 1
        ))
        WallService.add(Post(0, 1, 2, 1, 1648204060, "Some text",
            1, 1, 1, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 1, true, true, true, true,
            false, Donut(true, 1, " ", true, " "), 1
        ))

        val update = Post(1, 1, 2, 1, 1648204060, "Some text1",
            1, 1, 1, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 1, true, true, true, true,
            false, Donut(true, 1, " ", true, " "), 1
        )

        val result = WallService.update(update)

        assertTrue(result)

    }

    @Test
    fun updateExistingFalse() {
        WallService.add(Post(0, 1, 2, 1, 1648204060, "Some text",
            1, 1, 1, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 1, true, true, true, true,
            false, Donut(true, 1, " ", true, " "), 1
        ))
        WallService.add(Post(0, 1, 2, 1, 1648204060, "Some text",
            1, 1, 1, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 1, true, true, true, true,
            false, Donut(true, 1, " ", true, " "), 1
        ))
        WallService.add(Post(0, 1, 2, 1, 1648204060, "Some text",
            1, 1, 1, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 1, true, true, true, true,
            false, Donut(true, 1, " ", true, " "), 1
        ))

        val update = Post(5, 1, 2, 1, 1648204060, "Some text1",
            1, 1, 1, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 1, true, true, true, true,
            false, Donut(true, 1, " ", true, " "), 1
        )

        val result = WallService.update(update)

        assertFalse(result)

    }
}