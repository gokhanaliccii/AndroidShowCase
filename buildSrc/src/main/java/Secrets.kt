import java.io.File
import java.io.FileInputStream
import java.util.*

object Secrets {

    private val FILE_NAME = "apikey.properties"
    private val NY_TIMES_API_KEY_NAME = "NY_TIMES_API_KEY"

    val NY_TIMES_API_KEY = readApiKey() ?: ""

    private fun readApiKey(): String? {
        val file = File(FILE_NAME)
        if (!file.exists()) {
            print("You must have a file called $FILE_NAME in the project root directory.\n" +
                    "execute .\\gradlew createApiKeyFile to create that file for you")
            return null
        }
        val properties = Properties()
        properties.load(FileInputStream(file))
        return properties.getProperty(NY_TIMES_API_KEY_NAME)
    }
}