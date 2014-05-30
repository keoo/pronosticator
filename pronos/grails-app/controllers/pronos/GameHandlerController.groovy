package pronos
import pronos.Game;
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class GameHandlerController {

      def gameService
      def pronosticService
      def userService

      def index() {
      }

      def finalise(params) {
                def game = gameService.get(params.id)
                [params:game]
      }

      def scored() {
          def myparams = [b_domicile:params.domicile, b_exterieur:params.exterieur, game:params.id]
	  gameService.update(myparams)
          pronosticService.update(myparams)
          redirect(action:"list", controller:"game")
      }
}


