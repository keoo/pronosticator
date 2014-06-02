package pronos
import pronos.Game;
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER', 'ROLE_ADMIN'])
class GameController {

      def gameService
      def pronosticService
      def userService

      def index() {
          redirect(action:"list",params:params)
      }

      def list() {
          def next = gameService.listNext()          
	  def old = gameService.listOld()
          def pronostic = pronosticService.getByUser()
          [next:next, old:old, pronostic:pronostic]
      }


      def spy(params) {
          def next = gameService.listNext()
          def old = gameService.listOld()
          def pronostic = pronosticService.getByGivenUser(params.id)
          def user = userService.get(params.id)
          [next:next, old:old, pronostic:pronostic, user:user]
      }


      def pronosticated() {
          def myparams = [b_domicile:params.domicile, b_exterieur:params.exterieur, game:params.id]
          pronosticService.create(myparams)
          redirect(action:"list", params: myparams)
      }

      def refreshpoints(params){
          def toUpdate = gameService.get(params.id)
          def pronostic = pronosticService.getByGame(toUpdate)
	  for (prono in pronostic){
	      pronosticService.setPoints(prono, toUpdate)
	  }
      }

}


