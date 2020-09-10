package traffic_light

import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.paint.Color
import javafx.scene.shape.Circle
import javafx.scene.shape.Rectangle

class TrafficLightBuilder(private val width: Double, private val height: Double,
                          private val xIndent: Double, private val yIndent: Double,
                          private val radius : Double) {
    val scene : Scene
        get() {
            val rectangle = Rectangle()
            val redCircle = Circle()
            val yellowCircle = Circle()
            val greenCircle = Circle()

            val circleX = width / 2

            rectangle.x = (width - 2 * radius - 2 * xIndent) / 2
            rectangle.y = (height -  6 * radius - 4 * yIndent)/2
            rectangle.height = height
            rectangle.width = 2 * radius + 2 * xIndent

            redCircle.centerX = circleX
            redCircle.centerY = rectangle.y + radius + yIndent
            redCircle.radius = radius

            yellowCircle.centerX = circleX
            yellowCircle.centerY = redCircle.centerY + 2 * radius + yIndent
            yellowCircle.radius = radius

            greenCircle.centerX = circleX
            greenCircle.centerY = yellowCircle.centerY + 2 * radius + yIndent
            greenCircle.radius = radius

            redCircle.fill = Color.RED
            yellowCircle.fill = Color.YELLOW
            greenCircle.fill = Color.GREEN
            rectangle.fill = Color.BLACK

            val root = Group(rectangle, redCircle, yellowCircle, greenCircle)

            return Scene(root, width, height)
        }
}