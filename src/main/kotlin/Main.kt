
import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.paint.Color
import javafx.scene.shape.Circle
import javafx.scene.shape.Rectangle
import javafx.stage.Stage


class Main : Application() {
    override fun start(stage: Stage) {

        val redCircle = Circle()
        val yellowCircle = Circle()
        val greenCircle = Circle()
        val rectangle = Rectangle()

        redCircle.centerX = 350.0
        redCircle.centerY = 150.0
        redCircle.radius = 100.0

        yellowCircle.centerX = 350.0
        yellowCircle.centerY = 375.0
        yellowCircle.radius = 100.0

        greenCircle.centerX = 350.0
        greenCircle.centerY = 600.0
        greenCircle.radius = 100.0

        rectangle.x = 200.0
        rectangle.y = 25.0
        rectangle.height = 700.0
        rectangle.width = 300.0

        redCircle.fill = Color.RED
        yellowCircle.fill = Color.YELLOW
        greenCircle.fill = Color.GREEN
        rectangle.fill = Color.BLACK

        val root = Group(rectangle, redCircle, yellowCircle, greenCircle)

        val scene = Scene(root, 700.0, 750.0)

        stage.scene = scene
        stage.title = "Traffic light"
        stage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Main::class.java)
        }
    }
}

