package pronos
import pronos.Pronostic;
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER', 'ROLE_ADMIN'])
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
          def list = pronosticService.getSortedUsers()
//	  render "list:"+list
          [list:list]
      }

}