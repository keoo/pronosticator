package pronos
import pronos.User;
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class UserController {
      def userService

      def index(){
           redirect(action:"list",params:params)
      }

      def list() {
          def list = userService.list()
//          def list = userService.getSortedUsers()
          [list:list]
      }

}