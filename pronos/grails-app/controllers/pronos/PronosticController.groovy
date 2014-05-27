package pronos
import pronos.Pronostic;
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class PronosticController {

      def pronosticService
      def gameService

      def index() {
//          redirect(action:"create",params:params)
      }

      def create(params) {
                def game = gameService.get(params.id)
                [params:game]
      }

      def list() {
      }

}