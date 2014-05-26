package pronos
import pronos.Game;
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class GameController {

      def gameService

      def index() {

//      	  	  render "hello world"
//          redirect(action:"list",params:params)
      }

      def list() {
          def list = gameService.get()

          [list:list]
      }

}