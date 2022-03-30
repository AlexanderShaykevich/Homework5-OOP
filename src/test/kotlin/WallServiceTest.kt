import org.junit.After
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import WallService.attachments


class WallServiceTest {

    @Test
    fun addNew() {
        val examplePost = Post(1,1, 1, 1, 100, "Text", 1,
        1, 1, null, null, null, null, null, " ",
        null, attachments, null, 1, null, true, true, true,
        false, false, null, 1)
        val expected = 1

        val result = WallService.add(examplePost).id

        assertEquals(expected, result)
    }

    @Test
    fun updateExistingTrue() {
        WallService.add(Post(0,1, 1, 1, 100, "Text", 1,
            1, 1, null, null, null, null, null, " ",
            null, attachments, null, 1, null, true, true, true,
            false, false, null, 1))
        WallService.add(Post(0,1, 1, 1, 100, "Text", 1,
            1, 1, null, null, null, null, null, " ",
            null, attachments, null, 1, null, true, true, true,
            false, false, null, 1))
        WallService.add(Post(0,1, 1, 1, 100, "Text", 1,
            1, 1, null, null, null, null, null, " ",
            null, attachments, null, 1, null, true, true, true,
            false, false, null, 1))

        val update = Post(3,1, 1, 1, 100, "Text", 1,
            1, 1, null, null, null, null, null, " ",
            null, attachments, null, 1, null, true, true, true,
            false, false, null, 1)

        val result = WallService.update(update)

        assertTrue(result)

    }

    @Test
    fun updateExistingFalse() {
        WallService.add(Post(0,1, 1, 1, 100, "Text", 1,
            1, 1, null, null, null, null, null, " ",
            null, attachments, null, 1, null, true, true, true,
            false, false, null, 1))
        WallService.add(Post(0,1, 1, 1, 100, "Text", 1,
            1, 1, null, null, null, null, null, " ",
            null, attachments, null, 1, null, true, true, true,
            false, false, null, 1))
        WallService.add(Post(0,1, 1, 1, 100, "Text", 1,
            1, 1, null, null, null, null, null, " ",
            null, attachments, null, 1, null, true, true, true,
            false, false, null, 1))

        val update = Post(5,1, 1, 1, 100, "Text", 1,
            1, 1, null, null, null, null, null, " ",
            null, attachments, null, 1, null, true, true, true,
            false, false, null, 1)

        val result = WallService.update(update)

        assertFalse(result)

    }
}