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
                render "blaaaaaaaaaa "+params.id
                if (!game){
                   flash.message = "bla ->"+params.id+"<- "
                   flash.message = "bla ->"+params.match+"<-"
//                   render "blaaaaa"+params.match
//                   flash.message = "game ->"+params.matchid+"<-"
}
                [game:game]
      }

      def list() {
      }

}