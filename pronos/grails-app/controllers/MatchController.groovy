import game.Match;
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class MatchController {

      def matchService

      def index() {
          redirect(action:"list",params:params)
      }

      def list() {
          def match = jobService.get(params.id)

          [matchInstance:match]
      }

}