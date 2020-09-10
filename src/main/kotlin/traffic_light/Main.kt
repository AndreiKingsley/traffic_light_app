package traffic_light

import javafx.application.Application
import javafx.stage.Stage


class Main : Application() {
    override fun start(stage: Stage) {
        stage.scene = TrafficLightBuilder(700.0, 700.0, 50.0, 25.0, 100.0).scene
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

