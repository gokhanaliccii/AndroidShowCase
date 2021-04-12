import java.io.File
import java.io.FileInputStream
import java.util.*

object Secrets {

    private val FILE_NAME = "apikey.properties"
    private val NY_TIMES_API_KEY_NAME = "NY_TIMES_API_KEY"

    val NY_TIMES_API_KEY = apiKeysProperties().getProperty(NY_TIMES_API_KEY_NAME)

    private fun apiKeysProperties(): Properties {
        val file = File(FILE_NAME)
        if (!file.exists()) {
            throw Error("You need to prepare a file called $FILE_NAME in the project root directory.\n" +
                    "the content of the file should look something like: $NY_TIMES_API_KEY_NAME = XXX\n\n")
        }
        val properties = Properties()
        properties.load(FileInputStream(file))
        return properties
    }
}