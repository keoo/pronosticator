package pronos
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER', 'ROLE_ADMIN'])
class RuleController {

      def index(){
           redirect(action:"show",params:params)
      }

      def show() {

      }

}