package pronos
import pronos.Game;
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class GameController {

      def gameService

      def index() {
          redirect(action:"list",params:params)
      }

      def list() {
          def list = gameService.list()

          [list:list]
      }

}