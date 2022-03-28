import org.junit.After
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before


class WallServiceTest {

    @Test
    fun addNew() {
        val examplePost = Post(0,1,2,3,4,"Text here", 5, 6,
            7, comments = null, copyright = null, likes = null, reposts = null, views = null, " ", postSource = null, geo = null,
            8, copyHistory = null, true, true, true, false, false,
            donut = null, 9)
        val expected = 1

        val result = WallService.add(examplePost).id

        assertEquals(expected, result)
    }

    @Test
    fun updateExistingTrue() {
        WallService.add(Post(0,1,2,3,4,"Text here", 5, 6,
            7, comments = null, copyright = null, likes = null, reposts = null, views = null, " ", postSource = null, geo = null,
            8, copyHistory = null, true, true, true, false, false,
            donut = null, 9))
        WallService.add(Post(0,1,2,3,4,"Text here", 5, 6,
            7, comments = null, copyright = null, likes = null, reposts = null, views = null, " ", postSource = null, geo = null,
            8, copyHistory = null, true, true, true, false, false,
            donut = null, 9))
        WallService.add(Post(0,1,2,3,4,"Text here", 5, 6,
            7, comments = null, copyright = null, likes = null, reposts = null, views = null, " ", postSource = null, geo = null,
            8, copyHistory = null, true, true, true, false, false,
            donut = null, 9))

        val update = Post(1,1,2,3,4,"Text here", 5, 6,
            7, comments = null, copyright = null, likes = null, reposts = null, views = null, " ", postSource = null, geo = null,
            8, copyHistory = null, true, true, true, false, false,
            donut = null, 9)

        val result = WallService.update(update)

        assertTrue(result)

    }

    @Test
    fun updateExistingFalse() {
        WallService.add(Post(0,1,2,3,4,"Text here", 5, 6,
            7, comments = null, copyright = null, likes = null, reposts = null, views = null, " ", postSource = null, geo = null,
            8, copyHistory = null, true, true, true, false, false,
            donut = null, 9))
        WallService.add(Post(0,1,2,3,4,"Text here", 5, 6,
            7, comments = null, copyright = null, likes = null, reposts = null, views = null, " ", postSource = null, geo = null,
            8, copyHistory = null, true, true, true, false, false,
            donut = null, 9))
        WallService.add(Post(0,1,2,3,4,"Text here", 5, 6,
            7, comments = null, copyright = null, likes = null, reposts = null, views = null, " ", postSource = null, geo = null,
            8, copyHistory = null, true, true, true, false, false,
            donut = null, 9))

        val update = Post(5,1,2,3,4,"Text here", 5, 6,
            7, comments = null, copyright = null, likes = null, reposts = null, views = null, " ", postSource = null, geo = null,
            8, copyHistory = null, true, true, true, false, false,
            donut = null, 9)

        val result = WallService.update(update)

        assertFalse(result)

    }
}