package quizbackend.seaBattleApi.RestAPI.controller.impl

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import quizbackend.seaBattleApi.RestAPI.controller.MainMenuController
import quizbackend.seaBattleApi.RestAPI.service.MainMenuService

@RestController
@RequestMapping("/api")
class MainMenuControllerImpl(
    private val service: MainMenuService
) : MainMenuController {
    @PostMapping("/init")
    override fun initGameEvent(userId: Long) = service.initGame()

    @PostMapping("/playOnline")
    override fun chooseOnlineGameEvent(userId: Long) = service.chooseOnlineGame(userId)

    @PostMapping("/playOffline")
    override fun chooseOfflineGameEvent(userId: Long) = service.chooseOfflineGame(userId)

    @PostMapping("/reconnect")
    override fun reconnectEvent(userId: Long) = service.reconnect(userId)
}