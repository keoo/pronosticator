import Match;

@Secured(['ROLE_ADMIN'])
class MatchController {

      def matchService

      def index() {
          redirect(action:"list",params:params)
      }

      def list() {
          def match = jobService.get(params.id)

          [machineInstance:match]
      }

}