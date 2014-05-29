package pronos
import pronos.Game;
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class GameController {

      def gameService
      def pronosticService
      def userService

      def index() {
          redirect(action:"list",params:params)
      }

      def list() {
          def list = gameService.list()
          def pronostic = pronosticService.getByUser()
//          render "prono: "+pronostic
          [list:list, pronostic:pronostic]
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